import java.awt.Color;
import java.util.Random;

public class MemoryItem
{
    public int size;
    public Color color;
    public int start;
    public int end;
    public int Current_Page;
    
    public MemoryItem(int size,int start,int Current_Page)
    {
        this.size = size;
        this.color = randomColor();
        this.start = start;
        this.end = start+size;
        this.Current_Page = Current_Page;
    }
    
    public void setSize(int size)
    {
        size = size;
    }
    
    public void setColor(Color color)
    {
        color = color;
    }
    
    public void setStart(int newStart)
    {
        start = newStart;
    }
    
    public void setEnd(int newEnd)
    {
        end=newEnd;
    }
    
    public void setPage(int page)
    {
        Current_Page=page;
    }
    public int getSize()
    {
        return size;
    }
    
    public Color getColor()
    {
        return color;
    }
    
    public int getStart()
    {
        return start;
    }
    
    public int getEnd()
    {
        return end;
    }
    public int getPage()
    {
        return Current_Page;
    }
    
    @Override
    public String toString()
    {
        return ""+getSize()+","+getColor()+","+getStart()+","+getEnd()+","+getPage()+"|\n";
    }
    
    public Color randomColor()
    {
        Random random = new Random();
        final float hue = random.nextFloat();
        final float saturation = 1.0f;//1.0 for brilliant, 0.0 for dull
        final float luminance = 1.0f; //1.0 for brighter, 0.0 for black
        Color col = Color.getHSBColor(hue, saturation, luminance);
        return col;
    }
}
