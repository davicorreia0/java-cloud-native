public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentaVolume();
        smartTv.aumentaVolume();
        smartTv.aumentaVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(13);

        System.out.println("Canal atual: " + smartTv.canal);

        System.out.println();
        
        System.out.println("Tv Ligada : " + smartTv.ligada);
        System.out.println("Volume atual : " + smartTv.volume);


        smartTv.ligar ();
        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Mais um status -> Tv ligada? " + smartTv.ligada);
    
    }

}
    
