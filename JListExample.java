import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JListExample extends JFrame implements ActionListener
{
	JList month_1;
	Container con;
	JScrollPane mn_pan;
	JButton b1;
	JLabel lbl1;

	public JListExample()
	{
		setTitle("List Demo");
		setVisible(true);
		setSize(500,500);
		con=getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.LEFT));

		String mn_str[]={"Jan","Feb","March","April","May","June","July","August","September","October","November","December"};

		month_1=new JList(mn_str);
		mn_pan=new JScrollPane(month_1);
		con.add(mn_pan);
		b1=new JButton("Show");
		b1.addActionListener(this);
		con.add(b1);
		lbl1=new JLabel("Nothing Display");
		con.add(lbl1);

		month_1.setVisibleRowCount(4);
		month_1.setSelectedIndex(1);

		month_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand()=="Show") 
		{
			String data="";
			if (month_1.getSelectedIndex()!=-1) 
			{
				data="Month Selected: "+month_1.getSelectedValue();
				lbl1.setText(data);
			}	
		}
	}
	public static void main(String[] args) 
	{
		new JListExample();	
	}


}