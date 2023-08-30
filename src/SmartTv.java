public class SmartTv{

    private int volume = 5;
    private int channel = 5;
    private boolean onOrOff = false;

    public int getChannel(){
        return channel;
    }

    public int getVolume(){
        return volume;
    }

    public boolean getOnOrOff(){
        return onOrOff;
    }

    public boolean toConnect(){
        return onOrOff = !onOrOff;
    }

    public int upChannel(){

        if(channel >= 0 && channel < 5){
           return channel++;
        }
        return channel = 0;
    }

    public int downChannel(){

        if(channel > 0 && channel <= 5){
             return --channel;
        }
        return channel = 0;

    }

    public int changeChannel(int newChannel){

        if(newChannel >= 0 && newChannel <=5 ){
            return channel = newChannel;
        }

        return channel;
        
    }
    public int upVolume(){

        if(volume < 0 || volume >= 5 ){
            return volume = 0;
        }
        return ++volume;
    }

    public int downVolume(){
        if(volume < 0){
            return volume = 0;
        }
        return --volume;
    }
}