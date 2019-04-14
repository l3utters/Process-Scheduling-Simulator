import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Memory extends javax.swing.JFrame
{
    static final int MEMORY_TOTAL_SIZE = 3072;   //3072                         //INITIALIZE MEMORY SIZE PER PAGE
    static final int PAGE_SIZE = 1024;
    int Memory_Current_Taken = 0;                                               //AMOUNT OF MEMORY USED IN PAGE
    int Memory_Item_Count = 0;                                                    //AMOUNT OF ITEMS IN MEMORY
    int Page_One_Memory = 0;
    int Page_Two_Memory = 0;
    int Page_Three_Memory = 0;
    public JButton[] Memory_Cells = new JButton[MEMORY_TOTAL_SIZE];
    ArrayList<MemoryItem> List = new ArrayList<>();                             //ARRAY LIST TO STORE ITEMS
    public MemoryItem filler = new MemoryItem(0,0,0);
            
    public Memory()
    {
                                    //CREATE FILLER PROCESS TO SIMPLIFY LIST
        List.add(0, filler);                                                     //ADD FILLER PROCESS TO LIST
        
        initComponents();
        setup();                                                                //CREATE FIRST PAGE FRAME
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Add = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        size = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ProcessPane = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        amtLeft = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        inMemory = new javax.swing.JLabel();
        Remove = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        removall = new javax.swing.JTextField();
        Pages = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        MemoryTABS = new javax.swing.JTabbedPane();
        Page1 = new javax.swing.JPanel();
        Page2 = new javax.swing.JPanel();
        Page3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Virtual Memory Management");

        Add.setText("Add  to Memory");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Reset.setText("Reset Memory");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        jLabel1.setText("Virtual Memory");

        jLabel2.setText("Memory size");

        ProcessPane.setBackground(new java.awt.Color(204, 204, 204));
        ProcessPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ProcessPane.setAutoscrolls(true);
        ProcessPane.setOpaque(false);

        javax.swing.GroupLayout ProcessPaneLayout = new javax.swing.GroupLayout(ProcessPane);
        ProcessPane.setLayout(ProcessPaneLayout);
        ProcessPaneLayout.setHorizontalGroup(
            ProcessPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
        );
        ProcessPaneLayout.setVerticalGroup(
            ProcessPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
        );

        jLabel4.setText("Current Processes in Memory");

        jLabel5.setText("Amount of Memory left:");

        amtLeft.setText("3072");

        jLabel7.setText("Number of Processes in Memory");

        inMemory.setText("0");

        Remove.setText("Remove Process");
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });

        jLabel3.setText("Process Number");

        Pages.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout PagesLayout = new javax.swing.GroupLayout(Pages);
        Pages.setLayout(PagesLayout);
        PagesLayout.setHorizontalGroup(
            PagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PagesLayout.setVerticalGroup(
            PagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 243, Short.MAX_VALUE)
        );

        jLabel6.setText("Current Pages in Memory");

        javax.swing.GroupLayout Page1Layout = new javax.swing.GroupLayout(Page1);
        Page1.setLayout(Page1Layout);
        Page1Layout.setHorizontalGroup(
            Page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );
        Page1Layout.setVerticalGroup(
            Page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        MemoryTABS.addTab("Page Frame1", Page1);

        javax.swing.GroupLayout Page2Layout = new javax.swing.GroupLayout(Page2);
        Page2.setLayout(Page2Layout);
        Page2Layout.setHorizontalGroup(
            Page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );
        Page2Layout.setVerticalGroup(
            Page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        MemoryTABS.addTab("Page Frame 2", Page2);

        javax.swing.GroupLayout Page3Layout = new javax.swing.GroupLayout(Page3);
        Page3.setLayout(Page3Layout);
        Page3Layout.setHorizontalGroup(
            Page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );
        Page3Layout.setVerticalGroup(
            Page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        MemoryTABS.addTab("Page Frame 3", Page3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Reset))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(108, 108, 108)
                                                .addComponent(jLabel1))
                                            .addComponent(jLabel5))
                                        .addGap(77, 77, 77)
                                        .addComponent(amtLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(12, 12, 12)
                                        .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel3)
                                        .addGap(12, 12, 12)
                                        .addComponent(removall, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabel7)
                                        .addGap(85, 85, 85)
                                        .addComponent(inMemory, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ProcessPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Pages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(28, 28, 28)
                        .addComponent(MemoryTABS, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Add))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Remove))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(amtLeft)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2))
                    .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3))
                    .addComponent(removall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(inMemory)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Reset))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ProcessPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(7, 7, 7)
                        .addComponent(Pages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(MemoryTABS))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    //ADD PROCESSES INTO MEMORY
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {                                    
        
        //PARSES TEXT BOX TO FIND PROCESS MEMORY SIZE
        int Process_Memory = Integer.parseInt(size.getText());
        
        //RAN OUT OF MEMORY
        if(Process_Memory > MEMORY_TOTAL_SIZE || (Memory_Current_Taken + Process_Memory) > MEMORY_TOTAL_SIZE)
        {
            JOptionPane.showMessageDialog(null,"System is out of Memory or memory limit will be exceeded, no more items can be added", 
               "Process addition error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            //COLORS MEMORY BLOCKS AND CREATES THE PROCESS
            Memory_Item_Count++;
            MemoryItem item = new MemoryItem(Process_Memory, Memory_Current_Taken, 1);
            createProcess(item);
            
            for(int i = item.getStart(); i < item.getEnd(); i++)
            {
                    Memory_Cells[i].setBackground(item.getColor());
            }
            
            Memory_Current_Taken += Process_Memory;
            
            if(Memory_Current_Taken < PAGE_SIZE)
            {
                Page_One_Memory += Process_Memory;
                Page_Two_Memory = 0;
                Page_Three_Memory = 0;                
            }
            if(Memory_Current_Taken > PAGE_SIZE && Memory_Current_Taken < 2*PAGE_SIZE)
            {
                Page_One_Memory = PAGE_SIZE;
                Page_Two_Memory = Memory_Current_Taken-PAGE_SIZE;
                Page_Three_Memory=0;                
            }
            if(Memory_Current_Taken > 2*PAGE_SIZE)
            {
                Page_One_Memory = PAGE_SIZE;
                Page_Two_Memory = PAGE_SIZE;
                Page_Three_Memory = Memory_Current_Taken - Page_One_Memory - Page_Two_Memory;                
            }
            
            amtLeft.setText("" + (MEMORY_TOTAL_SIZE - Memory_Current_Taken));
            inMemory.setText("" + Memory_Item_Count);
            size.setText("");
            
            deBugger();
        }
    }                                   

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {                                      
        
        for(int i = MEMORY_TOTAL_SIZE-1; i >= 0 ; i--)
        {
            Memory_Cells[i].setBackground(Color.WHITE);
        }
        
            Memory_Current_Taken = 0;
            Page_One_Memory = 0;
            Page_Two_Memory = 0;
            Page_Three_Memory = 0;
            amtLeft.setText("" + MEMORY_TOTAL_SIZE);
            removall.setText("");
            inMemory.setText("0");
            ProcessPane.removeAll();
            ProcessPane.updateUI();
            List.clear();
            List.add(filler);
            Memory_Item_Count = 0;
    }                                     

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
        int index = Integer.parseInt(removall.getText());
        MemoryItem ToBeDeleted = List.get(index);
        
        //DEBUGGING
        System.out.println("Start: "+ToBeDeleted.getStart()+ " & End: " + ToBeDeleted.getEnd());
        
        for(int j = ToBeDeleted.getStart(); j <= ToBeDeleted.getEnd()-1; j++)
        {
                Memory_Cells[j].setBackground(Color.WHITE);
        }
            
        Memory_Item_Count--;
        
        ProcessPane.remove(index - 1);
        
        inMemory.setText("" + Memory_Item_Count);
        Memory_Current_Taken = Memory_Current_Taken - (ToBeDeleted.getEnd() - ToBeDeleted.getStart() );
        amtLeft.setText("" + (MEMORY_TOTAL_SIZE - Memory_Current_Taken));
        removall.setText("");
        ProcessPane.updateUI();
        
        //moveMemory(ToBeDeleted);
    }                                      
        
    public void createProcess(MemoryItem item)
    {
        List.add(Memory_Item_Count, item);
        //System.out.println(List);
        JButton temp = new JButton("Process " + Memory_Item_Count);
        temp.setBackground(item.getColor() );
        ProcessPane.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 5));
        ProcessPane.add(temp);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Memory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Memory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Memory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Memory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Memory().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton Add;
    private javax.swing.JTabbedPane MemoryTABS;
    private javax.swing.JPanel Page1;
    private javax.swing.JPanel Page2;
    private javax.swing.JPanel Page3;
    private javax.swing.JPanel Pages;
    private javax.swing.JPanel ProcessPane;
    private javax.swing.JButton Remove;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel amtLeft;
    private javax.swing.JLabel inMemory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField removall;
    private javax.swing.JTextField size;
    // End of variables declaration                   

    public void setup()
    {
        Page1.setLayout(new GridLayout(32, 32, 1, 1));
        Page2.setLayout(new GridLayout(32, 32, 1, 1));
        Page3.setLayout(new GridLayout(32, 32, 1, 1));
        for (int r = 0; r < MEMORY_TOTAL_SIZE; r++)
        {
            if(r<1024)
            {
                Memory_Cells[r] = new JButton();		
                Page1.add(Memory_Cells[r]);
                Memory_Cells[r].setPreferredSize(new Dimension(4, 4));
                Memory_Cells[r].setBackground(Color.WHITE);
            }
            else if(r<2048)
            {
                Memory_Cells[r] = new JButton();		
                Page2.add(Memory_Cells[r]);
                Memory_Cells[r].setPreferredSize(new Dimension(4, 4));
                Memory_Cells[r].setBackground(Color.WHITE);
            }
            else if(r<3072)
            {
                Memory_Cells[r] = new JButton();		
                Page3.add(Memory_Cells[r]);
                Memory_Cells[r].setPreferredSize(new Dimension(4, 4));
                Memory_Cells[r].setBackground(Color.WHITE);
            }
        }
        ProcessPane.setLayout(new GridLayout(2,2,2,2));
        add(ProcessPane);
    }
    
    //DEBUGGING METHOD
    public void deBugger()
    {
        System.out.println("PAGE ONE MEMORY: "+Page_One_Memory);
        System.out.println("PAGE TWO MEMORY: "+Page_Two_Memory);
        System.out.println("PAGE THREE MEMORY: "+Page_Three_Memory);
        System.out.println("TOTAL MEMORY USED: "+Memory_Current_Taken);
    }

//    private void moveMemory(MemoryItem Deleted)
//    {
//        int index = List.indexOf(Deleted);
//        
//        for(int i=index+1;i<=List.size();i++)
//        {
//            MemoryItem Temp = List.get(i);
//            Temp.setStart(List.get(i-1).getStart());
//            Temp.setEnd(List.get(i-1).getStart() + Temp.getSize());
//            for(int j = Temp.getStart(); j < Temp.getEnd(); j++)
//            {
//                    Memory_Cells[j].setBackground(Temp.getColor());
//            }
//        }
//        System.out.println("Start : "+List.get(index).getStart());
//        System.out.println("End : "+List.get(index).getEnd());
//        System.out.println("Start : "+List.get(index+1).getStart());
//        System.out.println("End : "+List.get(index+1).getEnd());
//    }
}
