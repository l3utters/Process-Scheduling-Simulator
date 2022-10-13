
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import static java.lang.Math.floor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingWorker;
import javax.swing.SwingUtilities;

public class Simulator extends javax.swing.JFrame
{
    ArrayList<ProcessItem> Processes = new ArrayList<>();                       //ARRAYLIST FOR PROCESSES
    ArrayList<JTextArea> Labels = new ArrayList<>();                            //ARRAYLIST FOR PROCESS LABELS
    ArrayList<JButton[]> Buttons = new ArrayList();                             //ARRAYLIST FOR PROCESS BOXES
        
    Font f = new Font( "arial" , Font.BOLD , 9 );                               //FONT FOR BUTTONS
    Font p = new Font( "arial" , Font.BOLD , 14 );                              //FONT FOR LABELS
    
    public Simulator()
    {
        initComponents();
        
        Block_Panel.setLayout(new GridLayout( 5 , 1 , 0 , 0 ));                 //SET LAYOUT TO PLACE BUTTONS
        Label_Panel.setLayout(new GridLayout( 5 , 1 , 0 , 0 ));                 //SET LAYOUT TO PLACE JTEXTAREA
        console.setEditable(false);                                             //SET JTEXTAREA EDITABLITY OFF
        
        priority.addItem("1");
        priority.addItem("2");
        priority.addItem("3");
        
        SwingUtilities.getRootPane(Add_Process).setDefaultButton(Add_Process);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        length = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        Add_Process = new javax.swing.JButton();
        cycles = new javax.swing.JLabel();
        quanta = new javax.swing.JLabel();
        priority = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Main_Panel = new javax.swing.JPanel();
        Label_Panel = new javax.swing.JPanel();
        Block_Panel = new javax.swing.JPanel();
        consoleScroller = new javax.swing.JScrollPane();
        console = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Process Scheduling Simulator");
        setBackground(new java.awt.Color(102, 102, 102));
        setName("Simulator"); // NOI18N

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Process Length:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Process Priority:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Process Name:");

        length.setBackground(new java.awt.Color(51, 51, 51));
        length.setForeground(new java.awt.Color(204, 204, 204));
        length.setToolTipText("Process Size can be between 1 and 36");
        length.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        name.setBackground(new java.awt.Color(51, 51, 51));
        name.setForeground(new java.awt.Color(204, 204, 204));
        name.setToolTipText("Enter Process Name as Letter");
        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Add_Process.setBackground(new java.awt.Color(204, 204, 204));
        Add_Process.setText("Add Process");
        Add_Process.setToolTipText("");
        Add_Process.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_Process_Button(evt);
            }
        });

        cycles.setForeground(new java.awt.Color(255, 255, 255));
        cycles.setText("Cycles : 0");

        quanta.setForeground(new java.awt.Color(255, 255, 255));
        quanta.setText("Quanta: 0");

        priority.setBackground(new java.awt.Color(51, 51, 51));
        priority.setEditable(true);
        priority.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(length, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(priority, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(Add_Process)
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cycles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(quanta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cycles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(quanta))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(priority))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(length, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Add_Process)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Round Robin Algorithm");
        jButton1.setToolTipText("Start Round Robin Scheduling Algorithm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RR_Button(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Priority Queue Algorithm");
        jButton2.setToolTipText("Start Priority Queue Scheduling Algorithm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Priority_Button(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Multi-Queue Algorithm");
        jButton3.setToolTipText("Start Multi - Queue Schedulin Algorithm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Multi_Button(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setText("Clear Process List");
        jButton4.setToolTipText("Clear All Processes Currently in List");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_Button(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Main_Panel.setBackground(new java.awt.Color(102, 102, 102));

        Label_Panel.setBackground(new java.awt.Color(102, 102, 102));
        Label_Panel.setAutoscrolls(true);
        Label_Panel.setLayout(new java.awt.GridLayout(1, 0));

        Block_Panel.setBackground(new java.awt.Color(102, 102, 102));
        Block_Panel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Block_Panel.setLayout(new java.awt.GridLayout(1, 0));

        console.setColumns(20);
        console.setRows(5);
        console.setBorder(null);
        consoleScroller.setViewportView(console);

        javax.swing.GroupLayout Main_PanelLayout = new javax.swing.GroupLayout(Main_Panel);
        Main_Panel.setLayout(Main_PanelLayout);
        Main_PanelLayout.setHorizontalGroup(
            Main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Main_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Block_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consoleScroller, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Main_PanelLayout.setVerticalGroup(
            Main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Main_PanelLayout.createSequentialGroup()
                .addGroup(Main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Block_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Label_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consoleScroller, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Main_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Main_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleDescription("Simulation of Process Scheduling with different scheduling algoritms");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Add_Process_Button(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_Process_Button
              
        if( length.getText().compareTo("") == 0 || name.getText().compareTo("") == 0 )
        {
            JOptionPane.showMessageDialog(null, "Please fill in all text boxes", "Process Addition Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            ProcessItem temp = new ProcessItem( 
                                                Integer.parseInt( length.getText() ),                    //GET SIZE OF PROCESS 
                                                Integer.parseInt((String) priority.getSelectedItem()),   //GET PRIORITY OF PROCESS
                                                name.getText()                                           //GET NAME OF PROCESS
                                               );
        
            length.setText( "" );                                               ////////////////////
                                                                                //RESET TEXT BOXES//
            name.setText( "" );                                                 ////////////////////
            
            Processes.add( temp );                                              //ADD PROCESS TO PROCESS LIST
            Create_Process( temp );                                             //FUNCTION TO CREATE PROCESS IN UI
        }
        
        
    }//GEN-LAST:event_Add_Process_Button

    public void Create_Process(ProcessItem temp) {
        
        console.append("\nProcess "+temp.getName()+" added to process list\n");
        
        JTextArea tempLabel = new JTextArea(temp.labelString());                //CREATE LABEL WITH PROCESS INFO
        tempLabel.setEditable(false);                                           //TURN JTEXTAREA EDITING OFF
        tempLabel.setFont(p);                                                   //SETS FONT OF JTEXTAREA
        tempLabel.setForeground(Color.WHITE);                                   //SET COLOT OF TEXT
        tempLabel.setBackground(new Color(102,102,102));                        //SET COLOR OF PANEL
        //tempLabel.setBackground(Color.BLUE);
        Labels.add(tempLabel);                                                  //ADD LABEL TO LABEL ARRAYLIST
        Label_Panel.add(tempLabel);                                             //ADD LABEL TO PANEL
        Label_Panel.revalidate();                                               //REVALIDATE PANEL
        
        
        JPanel tempPanel = new JPanel();                                        //CREATE PANEL FOR PROCESS
        tempPanel.setLayout(new FlowLayout(FlowLayout.LEFT));                   //SET LAYOUT FOR PANEL
        tempPanel.setBackground(Color.WHITE);                                   //SET COLOR FOR PANEl
        tempPanel.setVisible(true);                                             
        tempPanel.setBackground(new Color(102,102,102));                        //SET COLOR OF PANEL
        //tempPanel.setBackground(Color.BLUE);
        Block_Panel.add(tempPanel);                                             //ADD PANEL TO MAIN PANEL
        Block_Panel.revalidate();                                               //REVALIDATE PANEL                               
        
        
        JButton[] tempButton = new JButton[temp.getSize()];                     //CREATE BUTTON ARRAY WITH LENGTH OF PROCESS
        //Buttons.add(tempButton);                                                //ADD BUTTON ARRAY TO BUTTON ARRAYLIST
        temp.addButtons(tempButton);
        for(int i = 0; i < temp.getSize(); i++)                                 
        {
            tempButton[i] = new JButton();                                      //CREATES BUTTON TO FILL ARRAY
            tempPanel.add(tempButton[i]);                                       //ADD BUTTONS TO PANEL, CUSTOM TO EACH PROCESS
            tempButton[i].setPreferredSize(new Dimension(45, 30));              //SET BUTTON SIZE
            tempButton[i].setBackground(Color.LIGHT_GRAY);                      //COLOR BUTTONS
            tempButton[i].setText(""+(i+1));                                    //ADD BUTTON NUMBERS
            tempButton[i].setFont(f);                                           //SET FONT ON BUTTONS
        }
        
        tempPanel.revalidate();  
    }
    
    private void Clear_Button(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_Button

       
        Block_Panel.removeAll();
        Block_Panel.revalidate();
        Block_Panel.repaint();
        
        Label_Panel.removeAll();
        Label_Panel.revalidate();
        Label_Panel.repaint();
        
        console.setText("");
        
        Labels.clear();
        Processes.clear();
        Buttons.clear();
        
        cycles.setText("Cycles: 0");
        quanta.setText("Quanta: 0");
        
    }//GEN-LAST:event_Clear_Button

    private void RR_Button(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RR_Button
        
        RR_Worker RRthread = new RR_Worker();
        RRthread.execute();
        
    }//GEN-LAST:event_RR_Button

    class RR_Worker extends SwingWorker<Void, Void>
    {
        @Override
        public Void doInBackground()
        {
            
            Collections.sort(Processes,new SortSize());
            int cycle = 0;
            
            int avg=0;
            for(int i = 0; i < Processes.size();i++)
                avg += Processes.get(i).getSize();
            
            avg = (int) floor(avg/(Processes.size()*Processes.size()));
            
            quanta.setText("Quanta: "+avg);
            
            while( !Processes.get(Processes.size()-1).isComplete() )
            {
                for( int i = 0; i < Processes.size() ; i++ )
                {
                    if(Processes.get(i).isComplete())
                        ;
                    else
                    {
                        
                        int stop = (Processes.get(i).getSize()-Processes.get(i).getBurst()+avg);
                        
                        for( int j = stop-avg ; j < stop ; j++ )
                        {                      
                            if(Processes.get(i).Progress() >= Processes.get(i).getSize())
                            {
                                Processes.get(i).setComplete(true);
                                break;
                            }
                            else
                            {
                                Processes.get(i).getButtons()[j].setBackground(Color.ORANGE);
                                console.append("\n" + Processes.get(i).getName() + (j+1) );
                                Processes.get(i).decrementBurst();
                                cycle += 1;
                                cycles.setText("Cycles: "+cycle);
                                try{TimeUnit.MILLISECONDS.sleep(300);}
                                catch(Exception e){}
                            }
                            
                        }
                        try{TimeUnit.MILLISECONDS.sleep(150);}
                            catch(Exception e){}
                    }
                }
            }
            console.append("\nRound Robin Scheduling complete");
            
            return null;
        }
        
        @Override
        public void done()
        {
            
            
        }
    }
    
    private void Priority_Button(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Priority_Button
        
        Priority_Worker Pthread = new Priority_Worker();
        Pthread.execute();   
        
    }//GEN-LAST:event_Priority_Button

    class Priority_Worker extends SwingWorker<Void, Void>
    {
        @Override
        public Void doInBackground()
        {
            Collections.sort(Processes,new SortPriority());
            
//            for(int i =0; i < Processes.size();i++)
//                 System.out.println(Processes.get(i).debug());
            
            int cycle=0;
            for( int i = 0 ; i <Processes.size() ; i++ )
            {
                console.append("\nRunning Process "+Processes.get(i).getName());
                console.append("\nWith Priority: "+Processes.get(i).getPriority()+"\n");
                quanta.setText("Quanta: "+Processes.get(i).getSize());
                for( int j = 0 ;  j < Processes.get(i).getSize() ; j++ )
                {
                    Processes.get(i).getButtons()[j].setBackground(Color.ORANGE);
                    console.append(""+Processes.get(i).getName()+(j+1)+"\n");
                    
                    try{TimeUnit.MILLISECONDS.sleep(290);}
                    catch(Exception e){}
                    cycle+=1;
                    cycles.setText("Cycles: "+cycle);
                };
            }
            
            return null;
        }
        
        @Override
        public void done()
        {
            console.append("\nPriority Scheduling Complete");
        }
    }
    
    private void Multi_Button(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Multi_Button
        
        MQ_Worker MQthread = new MQ_Worker();
        MQthread.execute();
        
    }//GEN-LAST:event_Multi_Button
    
    class MQ_Worker extends SwingWorker<Void, Void>
    {
        @Override
        public Void doInBackground()
        {
            console.append("\nStart Multi-Queue Scheduling");
            //Collections.sort(temp,new SortPriority());
            int cycle = 0;
            int largest = 0;
            int index = 0;
            
            for(int i = 0 ; i < Processes.size();i++ )
            {
                if(Processes.get(i).getSize() > largest)
                {
                    largest = Processes.get(i).getSize();
                    index = i;
                }
            }
            
            while( !Processes.get( index ).isComplete() )
            {
                
                //ROUND ROBIN ON ALL PRIORITY 3 PROCESSES
                
                for(int i = 0 ; i < Processes.size() ; i++)
                {
                    quanta.setText("Quanta: 10");
                    if(Processes.get(i).isComplete())
                        ;
                    else if(Processes.get(i).getPriority() == 3)
                    {
                        for(int j = Processes.get(i).getCurrent() ; j < 10 ; j++)
                        {
                            if(Processes.get(i).getCurrent() >= Processes.get(i).getSize())
                            {    
                                Processes.get(i).setComplete(true);
                                break;
                            }
                            else
                            {
                                Processes.get(i).getButtons()[j].setBackground(Color.ORANGE);
                                Processes.get(i).setCurrent(1);
                                console.append("\n"+Processes.get(i).getName()+(j+1));
                                try{TimeUnit.MILLISECONDS.sleep(450);}
                                catch(Exception e){}
                                Processes.get(i).setPriority(2);
                                cycle++;
                                cycles.setText("Cycles: "+cycle);
                            }
                        }
                        
                        Labels.get(i).setText(Processes.get(i).labelString());
                    }
                }
                
                //ROUND ROBIN ON ALL PRIORITY 2 PORCESSES
                
                for(int i = 0 ; i < Processes.size() ; i++)
                {
                    quanta.setText("Quanta: 8");
                    if(Processes.get(i).isComplete())
                        ;
                    else if(Processes.get(i).getPriority() == 2)
                    {
                        int temp = Processes.get(i).getCurrent() + 8;
                        
                        for(int j = Processes.get(i).getCurrent() ; j < temp ; j++)
                        {
                            if(Processes.get(i).getCurrent() >= Processes.get(i).getSize())
                            {    
                                Processes.get(i).setComplete(true);
                                break;
                            }
                            else
                            {
                                Processes.get(i).getButtons()[j].setBackground(Color.ORANGE);
                                Processes.get(i).setCurrent(1);
                                console.append("\n"+Processes.get(i).getName()+(j+1));
                                try{TimeUnit.MILLISECONDS.sleep(450);}
                                catch(Exception e){}
                                Processes.get(i).setPriority(1);
                                cycle++;
                                cycles.setText("Cycles: "+cycle);
                            }
                        }
                        
                        Labels.get(i).setText(Processes.get(i).labelString());
                    }
                }
                
                //ROUND ROBIN ON ALL PRIORITY 1 PROCESSES
                
                for(int i = 0 ; i < Processes.size() ; i++)
                {
                    quanta.setText("Quanta: 6");
                    if(Processes.get(i).isComplete())
                        ;
                    else if(Processes.get(i).getPriority() == 1)
                    {
                        int temp = Processes.get(i).getCurrent() + 6;
                        
                        for(int j = Processes.get(i).getCurrent() ; j < temp ; j++)
                        {
                            if(Processes.get(i).getCurrent() >= Processes.get(i).getSize())
                            {    
                                Processes.get(i).setComplete(true);
                                break;
                            }
                            else
                            {
                                Processes.get(i).getButtons()[j].setBackground(Color.ORANGE);
                                Processes.get(i).setCurrent(1);
                                console.append("\n"+Processes.get(i).getName()+(j+1));
                                try{TimeUnit.MILLISECONDS.sleep(450);}
                                catch(Exception e){}
                                cycle++;
                                cycles.setText("Cycles: "+cycle);
                            }
                        }
                    }
                }
                
            }
            console.append("\nMulti-Queue Scheduling Complete");
            return null;
        }
        
        @Override
        public void done()
        {
            
        }
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
            java.util.logging.Logger.getLogger(Simulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Process;
    private javax.swing.JPanel Block_Panel;
    private javax.swing.JPanel Label_Panel;
    private javax.swing.JPanel Main_Panel;
    private static javax.swing.JTextArea console;
    private javax.swing.JScrollPane consoleScroller;
    private javax.swing.JLabel cycles;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField length;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<String> priority;
    private javax.swing.JLabel quanta;
    // End of variables declaration//GEN-END:variables

    class SortSize implements Comparator<ProcessItem>
    {
        @Override
        public int compare(ProcessItem one, ProcessItem two)
        {
            int c = one.getSize() - two.getSize();
            if(c == 0)
                c = one.getArrival() - two.getArrival();
            return c;
        }
    }

    class SortPriority implements Comparator<ProcessItem>
    {
        @Override
        public int compare(ProcessItem one, ProcessItem two)
        {
            int c = two.getPriority() - one.getPriority();
            if(c == 0)
                c = one.getArrival() - two.getArrival();
            return c;
        }
    }
    
    class SortArrival implements Comparator<ProcessItem>
    {
        @Override
        public int compare(ProcessItem one, ProcessItem two)
        {
            return one.getArrival() - two.getArrival();
        }
    }
    
}