package com.wfs.d3_doudizhu;

/**
 * 案例：斗地主
 * 一共54张牌
 * 花色：♥ ♠ ♦ ♣
 * 大小王：☀ 🌙
 * 启动游戏房间时，需提前准备好54张牌，洗牌、发牌、对牌排序、看牌
 */
public class Test {
    public static void main(String[] args) {
        // 1 牌类
        // 2 房间
        Room room = new Room();
        room.Start();
    }
}
