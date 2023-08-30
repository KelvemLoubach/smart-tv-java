public class Usuario {
    public static void main(String[] args){
        
        SmartTv smartTv = new SmartTv();

        smartTv.toConnect();
        smartTv.toConnect();
        smartTv.toConnect();

        smartTv.downChannel();
        smartTv.downChannel();
        smartTv.downChannel();
        smartTv.downChannel();
        smartTv.downChannel();
        smartTv.downChannel();

        smartTv.changeChannel(4);

        
        System.out.println("Tv está ligada: " + smartTv.getOnOrOff());

        System.out.println("Canal atual: " + smartTv.getChannel());

        System.out.println("O volume atual da tv é: " + smartTv.getVolume());

    }
}
