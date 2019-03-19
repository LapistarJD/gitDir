package cn.itGit;

public class Per {
    private static Per per;

    //无参构造
    public Per() {
    }

    public static Per getPer() {

        //饿汉模式
//        per = new Per();

        //懒汉模式
//        if (per==null){
//            per =new Per();
//        }

        return per;
    }


    public void myTest(String ... name) {

    }
}

