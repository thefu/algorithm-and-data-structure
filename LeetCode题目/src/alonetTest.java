public class alonetTest {

    private alonetTest(){

    }

    private alonetTest test;

    public alonetTest get(){

        if (null == test){
            test = new alonetTest();
        }

        return test;
    }

}
