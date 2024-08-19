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
            <!--按钮-->
                <el-button type="primary" @click="handleAddDepartment">
                    新增部门
                </el-button>
            <!--增加空隙-->
            <div style="margin-bottom: 20px;"></div> 
          <!--表格-->
          <el-table :data="tableDate" border style="width: 100%">
            <el-table-column type="index" label="序号" width="180">
            </el-table-column>
            <el-table-column prop="deptname" label="部门名称" width="230">
            </el-table-column>
            <el-table-column prop="updatetime" label="最后操作时间" width="230">
            </el-table-column>
            <el-table-column label="操作">
              <el-button type="primary" size="mini">编辑</el-button>
              <el-button type="danger" size="mini">删除</el-button>
            </el-table-column>
          </el-table>
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
    };
  },
  methods: {},
  mounted() {
    axios
      .get(
        "https://ca2fb9a9-a4bb-413f-bc44-07b45dc29cb2.mock.pstmn.io//dept/list"
      )
      .then((res) => {
        this.tableDate = res.data.data;
      });
  },
};
</script>
<style>
</style>