import java.applet.*;
import javax.swing.*;
public class b extends Applet
{
JFrame f1;
JPanel p1;
JMenu file,edit,format,view,open_with,pdf;
JMenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;
JMenuBar mb;
JTextArea tf;
public void init()
{
f1=new JFrame("Notepad");
p1=new JPanel();
file =new JMenu("file");
edit =new JMenu("edit");
format=new JMenu("format");
view=new JMenu("view");
open_with=new JMenu("open_with");
pdf=new JMenu("pdf");
tf=new JTextArea(50,80);
mb=new JMenuBar();
i1=new JMenuItem("new");
i2=new JMenuItem("open");
i3=new JMenuItem("save");
i4=new JMenuItem("insert");
i5=new JMenuItem("delete");
i6=new JMenuItem("size");
i7=new JMenuItem("font");
i8=new JMenuItem("zoom");
i9=new JMenuItem("notepad");
i10=new JMenuItem("browser");

f1.setSize(200,400);
f1.setVisible(true);

f1.add(p1);
p1.add(mb);
file.add(i1);
file.add(i2);
file.add(i3);
edit.add(i4);
edit.add(i5);
format.add(i6);
format.add(i7);
view.add(i8);
open_with.add(i9);
open_with.add(i10);
mb.add(file);
mb.add(edit);
mb.add(format);
mb.add(view);
p1.add(tf);
mb.add(open_with);
file.add(open_with);
i9.add(pdf);
f1.setJMenuBar(mb);
}
}