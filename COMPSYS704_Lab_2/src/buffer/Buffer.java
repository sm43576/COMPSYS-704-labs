package buffer;

import java.util.Vector;

public class Buffer
{
	private Vector v = null;
	private int length = 0;

	public Buffer(){
		v = new Vector(100);
		this.length=100;
	}

	public Buffer(int length)
	{
		v = new Vector(length);
		this.length=length;
	}

	public void push(Object o)
	{
		if(v.size() != length)
		{
			v.addElement(o);
		}
		else
		{
			throw new RuntimeException("Buffer full");
		}
	}

	public Object pop()
	{
		if(!v.isEmpty())
		{
			return v.remove(0);
		}
		else
		{
			throw new RuntimeException("Buffer Empty");
		}
	}

	public boolean isFull()
	{
		return ((v.size()==length)?true:false);
	}
	public boolean isEmpty()
	{
		return v.isEmpty();
	}
}
