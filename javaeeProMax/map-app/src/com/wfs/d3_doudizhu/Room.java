package com.wfs.d3_doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Room {
    String[] cardColors = new String[]{"♥", "♠", "♦", "♣"};
    String[] cardNumbers = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    // 54张牌
    private ArrayList<Card> cards = new ArrayList<>();

    public Room() {
        int size = 0;
        for (int i = 0; i < cardNumbers.length; i++) {
            ++size;
            for (int j = 0; j < cardColors.length; j++) {
                Card card = new Card(cardNumbers[i], cardColors[j], size);
                cards.add(card);
            }
        }
        // 单独加大小王
        Card card1 = new Card("", "小王", 53);
        Card card2 = new Card("", "大王", 54);
        cards.add(card1);
        cards.add(card2);
    }

    public void Start() {
        // 1 洗牌
        Collections.shuffle(cards);
        // 2 发牌
        ArrayList<Card> wfs = new ArrayList<>();
        ArrayList<Card> jsc = new ArrayList<>();
        ArrayList<Card> lgc = new ArrayList<>();
        for (int i = 0; i < cards.size()-3; i++) {
            Card c = cards.get(i);
            if (i % 3 == 0) wfs.add(c);
            else if (i % 3 == 1) jsc.add(c);
            else if (i % 3 == 2) lgc.add(c);
        }
        // 3 看牌
        System.out.println("---------------------------------看牌--------------------------------");
        System.out.println("wfs"+wfs);
        System.out.println("jsc"+jsc);
        System.out.println("lgc"+lgc);
        // 余下3张
        List<Card> lastCards = cards.subList(cards.size()-3,cards.size());// 分割List
        System.out.println("底牌是："+lastCards);
        // 地主拿3张
        System.out.println("---------------------------------地主拿走底牌--------------------------------");
        wfs.addAll(lastCards);
        // 4 对牌排序
        sortCards(wfs);
        sortCards(jsc);
        sortCards(lgc);
        // 5 再次看牌
        System.out.println("---------------------------------排序看牌--------------------------------");
        System.out.println("wfs"+wfs);
        System.out.println("lgc"+lgc);
        System.out.println("jsc"+jsc);
    }
    private void sortCards(ArrayList<Card> cards){
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o1.getSize() - o2.getSize();
            }
        });
    }
    public ArrayList<Card> getCards() {
        return cards;
    }
}
