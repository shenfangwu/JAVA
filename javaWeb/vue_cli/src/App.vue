<template>
    <router-view></router-view>
</template>
<script>

export default {
  // 用于注册局部组件，使得这些组件可以在当前组件的模板中使用。
  data(){
    return{
      message:"Hello Vue"
    }
  },
  methods:{

  }
}
</script>
<style>

</style>
