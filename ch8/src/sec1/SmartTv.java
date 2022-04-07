package sec1;

public class SmartTv implements RemoteControl,Searchable{
	private int volume;
	private int channel;
	@Override
	public void search(String url) {
		
	}
	@Override
	public void turnOn() {
		
	}
	@Override
	public void turnOff() {
		
	}
	@Override
	public void setVolume(int volume) { this.volume = volume;
	}
	@Override
	public int getVolume() {
		return volume;
	}
	
	public void setChannel(int channel) { this.channel = channel;
		
	}
	public int getChannel() {
		return channel;
	}


}
