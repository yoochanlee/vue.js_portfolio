<template>
  <div class="admin-container">
    <div class="admin-head">
      <b-jumbotron bg-variant="gray" text-variant="black" border-variant="dark">
        <template #header>Product Register!</template>

        <template #lead>
          <div>
            <div class="d-flex align-items-center mb-3">
              <b-progress class="w-100" :max="maxLoadingTime" height="1.5rem">
                <b-progress-bar
                  variant="secondary"
                  :value="loadingTime"
                  :label="`${((loadingTime / maxLoadingTime) * 100).toFixed(2)}%`"
                ></b-progress-bar>
              </b-progress>

              <b-button class="ml-3" @click="startLoading()">load</b-button>
            </div>

            <b-skeleton-wrapper :loading="loading">
              <template #loading>
                <b-card>
                  <b-skeleton width="85%"></b-skeleton>
                  <b-skeleton width="55%"></b-skeleton>
                  <b-skeleton width="70%"></b-skeleton>
                </b-card>
              </template>

              <b-card>
                판매자와 구매자의 건전하고 가치있는 전자상거래환경 조성을 위하여 상품등록정책을 운영하고 있습니다.
                Men`s clothing store에서는 판매자와 구매자의 건전하고 안전한 전자상거래를 위해 현행법령상 신고·허가·인증
                또는 판매자격 요건이 필요하거나 상품 판매 시 주의가 필요한 상품군을 ‘취급주의상품’으로 정의하고 아래와 같이 관련 내용을 안내 드리고 있습니다.
                신고·허가·인증 또는 판매자격 요건을 갖추지 않고 상품을 판매할 경우 해당 상품은 관리자에 의해 판매금지 처리되며 직권으로 거래취소가 진행될 수 있습니다.
                또한, 상품을 등록한 판매자에 대해서는 서비스 이용이 정지될 수 있으니 상품 등록 시 유의하여 주시기 바랍니다.
              </b-card>
            </b-skeleton-wrapper>
          </div>
        </template>
      </b-jumbotron>
    </div>
    <div class="product-join">
      <b-card bg-variant="white">
        <b-form-group
          label-cols-lg="3"
          label="상품등록"
          label-size="lg"
          label-class="font-weight-bold pt-0"
          class="mb-0"
        ></b-form-group>
        <b-row class="my-1">
          <b-col sm="1">
            <label for="input-default">상품이름</label>
          </b-col>
          <b-col sm="8">
            <b-form-input id="input-default" placeholder="Enter product name" v-model="p.p_name"></b-form-input>
          </b-col>
        </b-row>

        <b-row class="my-1">
          <b-col sm="1">
            <label for="price">상품가격</label>
          </b-col>
          <b-col sm="8">
            <b-form-input type="number" id="price" placeholder="Enter product price" v-model="p.p_price"></b-form-input>
          </b-col>
        </b-row>
        <b-row class="my-1">
          <b-col sm="1">
            <label for="amount">상품수량</label>
          </b-col>
          <b-col sm="8">
            <b-form-input type="number" id="amount" placeholder="Enter product amount" v-model="p.p_amount"></b-form-input>
          </b-col>
        </b-row>
        <b-row class="my-1">
          <b-col sm="1">
            <label for="p_img">카테고리</label>
          </b-col>
          <b-col sm="7">
            <b-form-select v-model="p.p_category" :options="options" size="lg" class="mt-3"></b-form-select>
          </b-col>
        </b-row>
        <b-row class="my-1">
          <b-col sm="1">
            <label for="p_img">이미지파일</label>
          </b-col>
          <b-col sm="7">
            <b-form-file
              v-model="file"
              multiple :file-name-formatter="formatNames"
              type="file"
              ref="file"
              placeholder="Choose a file or drop it here..."
            ></b-form-file>
          </b-col>
          <b-col sm="1">
            <b-button @click="clearFiles">Reset</b-button>
          </b-col>
        </b-row>
        <b-row class="my-1">
          <b-col sm="1">
            <label for="textarea-auto-height">상품정보</label>
          </b-col>
          <b-col sm="8">
            <b-form-textarea
              id="textarea-auto-height"
              placeholder="Enter Product info"
              rows="3"
              max-rows="8"
            v-model="p.p_info"></b-form-textarea>
          </b-col>
        </b-row>
        <b-row class="my-1">
          <b-col lg="5" sm="1">
            <b-button variant="dark" style="margin-right:10px;">뒤로</b-button>

            <b-button variant="dark">등록</b-button>
          </b-col>
        </b-row>
      </b-card>
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      p_name:"",
      p_price:0,
      p_amount:0,
      m_idx:"",
      p_info:"",
      file:null,
      selected: null,
      options: [
        { value: null, text: "카테고리를 선택해주세요" },
        { value: "OUTER", text: "OUTER" },
        { value: "TOP", text: "TOP" },
        { value: "SHIRTS", text: "SHIRTS" },
        { value: "PANTS", text: "PANTS" },
        { value: "SHOES", text: "SHOES" },
        { value: "BAG", text: "BAG" }
      ],
      loading: false,
      loadingTime: 0,
      maxLoadingTime: 3
    };
  },
    created:function() {
    const self = this;
    self.p_idx = sessionStorage.getItem("p_idx");
    this.$axios.get('/produts/' + self.p_idx)
      .then(function(res) {
        if (res.data.result) {
          self.p = res.data.p;
          alert(self.p_idx);
          alert(self.p);
        }
      });
  },
  watch: {
    loading(newValue, oldValue) {
      if (newValue !== oldValue) {
        this.clearLoadingTimeInterval();
        if (newValue) {
          this.$_loadingTimeInterval = setInterval(() => {
            this.loadingTime++;
          }, 1000);
        }
      }
    },
    loadingTime(newValue, oldValue) {
      if (newValue !== oldValue) {
        if (newValue === this.maxLoadingTime) {
          this.loading = false;
        }
      }
    }
  },
  created() {
    this.$_loadingTimeInterval = null;
  },
  mounted() {
    this.startLoading();
  },
  methods: {
    
    },
    clearLoadingTimeInterval() {
      clearInterval(this.$_loadingTimeInterval);
      this.$_loadingTimeInterval = null;
    },
    startLoading() {
      this.loading = true;
      this.loadingTime = 0;
    },
    formatNames(files) {
      return files.length === 1
        ? files[0].name
        : `${files.length} files selected`;
    },
    clearFiles() {
      this.$refs.file.reset();
    }
};
</script>
<style scoped>
.col-lg-5 {
    margin: auto;
}
.mt-3 {
  margin-top: 0 !important;
}
.row {
  --bs-gutter-x: 1.5rem;
  --bs-gutter-y: 20px;
  margin-top: 10px;
}
.admin-head {
  margin: auto;
  padding: 10px 100px;
  text-align: center;
}
.product-join {
  padding: 90px 300px;
}
</style>