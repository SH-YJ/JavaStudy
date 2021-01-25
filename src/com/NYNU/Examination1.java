package com.NYNU;

/**
 * @author SH_YJ
 * @date 2020/12/28 13:08
 */
class Examination1 {
    public static class Goods {
        private int num;
        private String name;
        private int price;
        public Goods(){

        }

        public Goods(int num,String name,int price){
            this.num = num;
            this.name = name;
            this.price = price;
        }

        public int getNum() {
            return num;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        Goods good = new Goods(1,"asd",3);
        System.out.println(good.getNum());
        System.out.println(good.getName());
        System.out.println(good.getPrice());
    }
}
