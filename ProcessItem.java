import javax.swing.JButton;

public class ProcessItem
{
    public int Process_Size;
    public int Process_Priority;
    public String Process_Name;
    public int Arrival_Time;
    public JButton[] Buttons;
    public boolean complete;
    public int Burst_Time;
    public int Current;
    
    public ProcessItem(int size, int priority, String name)
    {
        this.Process_Size = size;
        this.Process_Priority = priority;
        this.Process_Name = name;
        this.Arrival_Time = (int) System.currentTimeMillis();
        this.complete = false;
        this.Burst_Time = size;
        this.Current = 0;
    }
    
    public void setSize(int size)                                               //////////////////
    {                                                                           // SET THE SIZE //
        Process_Size = size;                                                    //OF THE PROCESS//
    }                                                                           //////////////////
    
    public int getSize()                                                        //////////////////
    {                                                                           // GET THE SIZE //
        return Process_Size;                                                    //OF THE PROCESS//
    }                                                                           //////////////////
    
    public void setPriority(int priority)                                       ////////////////////
    {                                                                           //SET THE PRIORITY//
        Process_Priority = priority;                                            // OF THE PROCESS //
    }                                                                           ////////////////////
    
    public int getPriority()                                                    ////////////////////
    {                                                                           //GET THE PRIORITY//
        return Process_Priority;                                                // OF THE PROCESS //
    }                                                                           ////////////////////
    
    public void setName(String name)                                            //////////////////
    {                                                                           // GET THE NAME //
        Process_Name = name;                                                    //OF THE PROCESS//
    }                                                                           //////////////////
    
    public String getName()                                                     //////////////////
    {                                                                           // SET THE NAME //
        return Process_Name;                                                    //OF THE PROCESS//
    }                                                                           //////////////////
    
    public void setComplete(boolean flag)                                       /////////////////////
    {                                                                           //SET COMPLETE FLAG//
        complete = flag;                                                        //  OF THE PROCESS //
    }                                                                           /////////////////////
    
    public boolean isComplete()                                                 /////////////////////
    {                                                                           //GET COMPLETE FLAG//
        return complete;                                                        //  OF THE PROCESS //
    }                                                                           /////////////////////
    
    public void decrementBurst()                                                //////////////////////
    {                                                                           //SET THE BURST TIME//
        Burst_Time --;                                                          //  OF THE PROCESS  //
    }                                                                           //////////////////////
    
    public int getBurst()                                                       //////////////////////////
    {                                                                           //GET CURRENT BURST TIME//
        return Burst_Time;                                                      //    OF THE PROCESS    //
    }                                                                           //////////////////////////
    
    public int Progress()                                                       
    {
        return this.getSize() - this.getBurst();
    }
    
    public void setCurrent(int add)
    {
        Current = Current + add;
    }
    
    public int getCurrent()
    {
        return Current;
    }
    
    public void addButtons(JButton[] buttons)                                   //////////////////
    {                                                                           //ADD BUTTONS TO//
        Buttons = buttons;                                                      //    PROCESS   //
    }                                                                           //////////////////
    
    public JButton[] getButtons()                                               ///////////////////
    {                                                                           //GET BUTTONS FOR//
        return Buttons;                                                         //    PROCESS    //
    }                                                                           ///////////////////
        
    public int getArrival()                                                     ////////////////////
    {                                                                           //GET ARRIVAL TIME//
        return Arrival_Time;                                                    // OF THE PROCESS //
    }                                                                           ////////////////////
    
    public String labelString()                                                 ///////////////////////
    {                                                                           //GET STRING TO PRINT//
        return "\nProcess: \t"+getName()+                                       //   PROCESS LABEL   //
               "\nPriority: \t"+getPriority();                                  ///////////////////////
    }                                                                           ///////////////////////
    
    public String debug()
    {
        return "\nName: \t"+getName()+
               "\nPriority: \t"+getPriority()+
               "\nSize: \t"+getSize()+
               "\nArrival Time: \t"+getArrival()+
               "\nBurst Time: \t"+getBurst();
    }  
    
}
