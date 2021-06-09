<template>
<div>
  <h3>login form</h3>
  <div>
    <label for='id'>ID</label>
    <input type="text" id='id' v-model='id' />
  </div>
  <div>
    <label for='pwd'>PWD</label>
    <input type="password" id='pwd' v-model='pwd' />
  </div>
  <button v-on:click='login'>login</button>
  <router-link to='/loin'>loin</router-link>
</div>
</template>


