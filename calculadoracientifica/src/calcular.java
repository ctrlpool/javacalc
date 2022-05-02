

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;


/**Documentación calculadora cientifica
 * generado con javadoc  - 2022
 * @author ctrlpool
 * @version 0.1 
 * class calcular
 */
public class calcular {
	/**genera una calculadora científica en modo gráfico
	 * @param no tiene parámetros de entrada
	 */
	private static Text txtDisplay;
	static double firstnum;
	static double secondnum;
	static double result;
	static String operations;
	String answer;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(315, 390);
		shell.setText("Calculadora");
		
		
		Button btn1 = new Button(shell, SWT.NONE);
		btn1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String iNum =txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(iNum);
				txtDisplay.setBounds(24,235,205,27);
				
			}
		});
		btn1.setBounds(24, 24, 39, 27);
		btn1.setText("1");
		
		txtDisplay = new Text(shell, SWT.BORDER);
		txtDisplay.setBounds(24, 235, 205, 27);
		
		Button btn2 = new Button(shell, SWT.NONE);
		btn2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String iNum =txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn2.setText("2");
		btn2.setBounds(69, 24, 39, 27);
		
		Button btn3 = new Button(shell, SWT.NONE);
		btn3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String iNum =txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn3.setText("3");
		btn3.setBounds(114, 24, 39, 27);
		
		Button btn4 = new Button(shell, SWT.NONE);
		btn4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String iNum =txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn4.setText("4");
		btn4.setBounds(24, 74, 39, 27);
		
		Button btn5 = new Button(shell, SWT.NONE);
		btn5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String iNum =txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn5.setText("5");
		btn5.setBounds(69, 74, 39, 27);
		
		Button btn6 = new Button(shell, SWT.NONE);
		btn6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String iNum =txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn6.setText("6");
		btn6.setBounds(114, 74, 39, 27);
		
		Button btn7 = new Button(shell, SWT.NONE);
		btn7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String iNum =txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn7.setText("7");
		btn7.setBounds(24, 125, 39, 27);
		
		Button btn8 = new Button(shell, SWT.NONE);
		btn8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String iNum =txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn8.setText("8");
		btn8.setBounds(69, 125, 39, 27);
		
		Button btn9 = new Button(shell, SWT.NONE);
		btn9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String iNum =txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn9.setText("9");
		btn9.setBounds(114, 125, 39, 27);
		
		Button btn0 = new Button(shell, SWT.NONE);
		btn0.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String iNum =txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn0.setText("0");
		btn0.setBounds(24, 173, 39, 27);
		
		Button btnsum = new Button(shell, SWT.NONE);
		btnsum.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="+";
			}
		});
		btnsum.setText("+");
		btnsum.setBounds(185, 24, 39, 27);
		
		Button btnrest = new Button(shell, SWT.NONE);
		btnrest.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="-";
				
			}
		});
		btnrest.setText("-");
		btnrest.setBounds(185, 74, 39, 27);
		
		Button btnprod = new Button(shell, SWT.NONE);
		btnprod.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="*";
			}
		});
		btnprod.setText("*");
		btnprod.setBounds(185, 125, 39, 27);
		
		Button btndiv = new Button(shell, SWT.NONE);
		btndiv.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="/";
			}
		});
		btndiv.setText("/");
		btndiv.setBounds(185, 173, 39, 27);
		
		Button del = new Button(shell, SWT.NONE);
		del.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String del=null;
				if (txtDisplay.getText().length()>0) {
				StringBuilder strB = new StringBuilder(txtDisplay.getText());
				strB.deleteCharAt(txtDisplay.getText().length()-1);
				del = strB.toString();
				txtDisplay.setText(del);
				}
				
			}
			
		});
		del.setText("del");
		del.setBounds(241, 74, 39, 27);
		
		Button btnRaiz = new Button(shell, SWT.NONE);
		btnRaiz.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.sqrt(ops);
                txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnRaiz.setText("raiz");
		btnRaiz.setBounds(241, 24, 39, 27);
		
		Button btnIgual = new Button(shell, SWT.NONE);
		btnIgual.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String answer;
				secondnum=Double.parseDouble(txtDisplay.getText());
				if (operations=="+") {
						result=firstnum+secondnum;
						answer=String.format("%.2f", result);
						txtDisplay.setText(answer);
				}
				else if (operations=="-") {
						result=firstnum-secondnum;
						answer=String.format("%.2f", result);
						txtDisplay.setText(answer);			
				}
				else if (operations=="*") {
							result=firstnum*secondnum;
							answer=String.format("%.2f", result);
							txtDisplay.setText(answer);
				}
				else if (operations=="/") {
								result=firstnum/secondnum;
								answer=String.format("%.2f", result);
								txtDisplay.setText(answer);	
				}
				else if (operations=="Mod") {
					result=firstnum%secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);	
				}
				else if (operations=="exp") {
					result=Math.pow(firstnum, secondnum);
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);	
				}
				
		    	}
		});
		btnIgual.setText("=");
		btnIgual.setBounds(241, 173, 39, 27);
		
		Button btnC = new Button(shell, SWT.NONE);
		btnC.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				txtDisplay.setText("");
			}
		});
		btnC.setText("C");
		btnC.setBounds(241, 125, 39, 27);
		
		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);
		
		MenuItem mnFile = new MenuItem(menu, SWT.CASCADE);
		mnFile.setText("File");
		
		Menu menu_1 = new Menu(mnFile);
		mnFile.setMenu(menu_1);
		
		MenuItem mntmStandard = new MenuItem(menu_1, SWT.NONE);
		mntmStandard.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.setSize(315, 390);
				shell.setText("Calculadora Básica");
				txtDisplay.setBounds(24,235,205,27);
			}
		});
		mntmStandard.setText("Standard");
		
		MenuItem mntmCientfica = new MenuItem(menu_1, SWT.NONE);
		mntmCientfica.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.setSize(500, 390);
				shell.setText("Calculadora Científica");
				txtDisplay.setBounds(24,235,410,27);
			
			
			}
		});
		mntmCientfica.setText("Científica");
		
		MenuItem mntmConversorUnidades = new MenuItem(menu_1, SWT.NONE);
		mntmConversorUnidades.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {		
							
				shell.setSize(800, 390);
				shell.setText("Conversor de unidades");
				txtDisplay.setBounds(24,235,410,27);
			}
		});
		mntmConversorUnidades.setText("Conversor unidades");
		
		MenuItem mntmSalir = new MenuItem(menu_1, SWT.NONE);
		mntmSalir.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.exit(0);			
						
			}
		});
		mntmSalir.setText("Salir");
		
		Button btnsin = new Button(shell, SWT.NONE);
		btnsin.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.sin(ops);
                txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnsin.setText("sin");
		btnsin.setBounds(349, 24, 39, 27);
		
		Button btnexp = new Button(shell, SWT.NONE);
		btnexp.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="exp";		
											
			}
		});
		btnexp.setText("exp");
		btnexp.setBounds(349, 74, 39, 27);
		
		Button btnLog = new Button(shell, SWT.NONE);
		btnLog.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.log(ops);
                txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnLog.setText("log");
		btnLog.setBounds(349, 125, 39, 27);
		
		Button btnmod = new Button(shell, SWT.NONE);
		btnmod.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="Mod";
			}
		});
		btnmod.setText("mod");
		btnmod.setBounds(349, 173, 39, 27);
		
		Button btnbin = new Button(shell, SWT.NONE);
		btnbin.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int a = Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toString(a,2));
			}
		});
		btnbin.setText("bin");
		btnbin.setBounds(394, 24, 39, 27);
		
		Button btnhex = new Button(shell, SWT.NONE);
		btnhex.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int a = Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toString(a,16));
			}
		});
		btnhex.setText("hex");
		btnhex.setBounds(394, 74, 39, 27);
		
		Button btnpi = new Button(shell, SWT.NONE);
		btnpi.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				double ops;
				ops=(3.14159265358);
                txtDisplay.setText(String.valueOf(ops));				
			}
		});
		btnpi.setText("pi");
		btnpi.setBounds(394, 125, 39, 27);
		
		Button btnlnx = new Button(shell, SWT.NONE);
		btnlnx.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=Math.log10(ops);
                txtDisplay.setText(String.valueOf(ops));	
			}
		});
		btnlnx.setText("lnx");
		btnlnx.setBounds(394, 173, 39, 27);

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
