module.exports = {  
  outputDir: "../src/main/resources/static",  
  indexPath: "../static/index.html",  
  devServer: {  
    proxy: "http://localhost:8888"    //(스프링부트 주소:포트)
  }
};