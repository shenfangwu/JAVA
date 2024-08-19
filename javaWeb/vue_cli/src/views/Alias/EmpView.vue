<template>
  <div>
    <el-container style="height: 700px; border: 1px solid #eee">
      <el-header style="font-size: 40px; background-color: rgb(238, 241, 246)"
        >alias 智能学习辅助系统
      </el-header>
      <el-container>
        <el-aside width="230px" style="border: 1px solid #eee">
          <el-menu :default-openeds="['1', '3']">
            <el-submenu index="1">
              <template slot="title"
                ><i class="el-icon-message"></i>系统信息管理</template
              >
              <el-menu-item index="1-1">
                <router-link to="dept">部门管理</router-link>
              </el-menu-item>
              <el-menu-item index="1-2">
                <router-link to="emp">人员管理</router-link>
              </el-menu-item>
            </el-submenu>
          </el-menu>
        </el-aside>
        <el-main>
          <!-- 表单 -->
          <el-form :inline="true" :model="searchInfo" class="demo-form-inline">
            <el-form-item label="姓名">
              <el-input v-model="searchInfo.user" placeholder="姓名"></el-input>
            </el-form-item>
            <el-form-item label="性别">
              <el-select v-model="searchInfo.region" placeholder="性别">
                <el-option label="男" value="male"></el-option>
                <el-option label="女" value="female"></el-option>
              </el-select>
            </el-form-item>
            <el-form-item>
              <span class="demonstration">入职时间从</span>
              <el-date-picker
                v-model="searchInfo.entrydate"
                type="monthrange"
                range-separator="至"
                start-placeholder="开始月份"
                end-placeholder="结束月份"
              >
              </el-date-picker>
            </el-form-item>
            <el-form-item>
              <el-button type="primary" @click="onSubmit">查询</el-button>
            </el-form-item>
          </el-form>
          <!--表格-->
          <el-table :data="tableDate" border style="width: 100%">
            <el-table-column prop="name" label="姓名" width="180">
            </el-table-column>
            <el-table-column label="图片" width="180">
              <template slot-scope="scope">
                <img :src="scope.row.image" width="100px" height="70px" />
              </template>
            </el-table-column>
            <el-table-column label="性别" width="180">
              <!--通过 Scoped slot 可以获取到 row, column-->
              <template slot-scope="scope">
                {{ scope.row.gender == 1 ? "男" : "女" }}
              </template>
            </el-table-column>
            <el-table-column prop="job" label="职位" width="140">
            </el-table-column>
            <el-table-column prop="entrydate" label="入职日期" width="140">
            </el-table-column>
            <el-table-column prop="updatetime" label="最后操作时间" width="230">
            </el-table-column>
            <el-table-column label="操作">
              <el-button type="primary" size="mini">编辑</el-button>
              <el-button type="danger" size="mini">删除</el-button>
            </el-table-column>
          </el-table>
          <!--分页条-->
          <el-pagination
            background
            layout="prev, pager, next"
            :total="100"
            @size-change="handleSizeChange"
            @current-change="handleCurrentChange"
          >
          </el-pagination>
        </el-main>
      </el-container>
    </el-container>
  </div>
</template>
<script>
import axios from "axios";
export default {
  data() {
    return {
      tableDate: [],
      searchInfo: {
        name: "",
        gender: "",
        entrydate: [],
      },
    };
  },
  methods: {
    handleSizeChange(val) {
      console.log(`每页 ${val} 条`);
    },
    handleCurrentChange(val) {
      console.log(`当前页: ${val}`);
    },
    onSubmit() {
      alert("开始查询！！！");
    },
  },
  mounted() {
    axios
      .get("https://mock.apifox.cn/m1/3128855-0-default/emp/list")
      .then((res) => {
        this.tableDate = res.data.data;
      });
  },
};
</script>
<style>
</style>