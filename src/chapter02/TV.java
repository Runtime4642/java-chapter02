package chapter02;

public class TV {
	private int channel; //0~50
	private int	volume; //0~50
	private boolean power; //power가 꺼져있으면 볼륨 및 채널이 안돌아감
	
	public TV(int channel,int volume,boolean power)
	{
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	public void channel(int channel)
	{
		if(power==false)
		{
			System.out.println("error TV전원이 꺼져있습니다");
		}
		else
		{
			if(channel>=0&&channel<=50)
			this.channel = channel;
			else if(channel>50)
				this.channel=0;
			else 
				this.channel=50;
		}
		
	}
	public void channel(boolean up) {
		if(up)
			channel(this.channel+1);
		else
			channel(this.channel-1);
	}
	public void volume(int volume)
	{
		if(power==false)
		{
			System.out.println("error TV전원이 꺼져있습니다");
		}
		else
		{
			if(volume>=0&&volume<=50)
			this.volume = volume;
			else if(volume>50)
				this.volume=50;
			else 
				this.volume=0;
		}
	}
	public void volume(boolean up) {
		if(up)
			volume(this.volume+1);
		else
			volume(this.volume-1);
	}
	
	public void power(boolean on) {
		if(on)
		power = true;
		else
			power =false;
	}
	public void status() {
		System.out.println("TV[power="+power+", channel="+channel+" , volume="+volume+"]");
	}

}
