import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class calcular {
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
		shell.setSize(450, 300);
		shell.setText("Calculadora");
		
		Button btn1 = new Button(shell, SWT.NONE);
		btn1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String iNum =txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(iNum);
				
			}
		});
		btn1.setBounds(24, 24, 39, 27);
		btn1.setText("1");
		
		txtDisplay = new Text(shell, SWT.BORDER);
		txtDisplay.setBounds(24, 235, 200, 27);
		
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
		del.setBounds(230, 74, 39, 27);
		
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
		btnRaiz.setBounds(230, 24, 39, 27);
		
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
				
		    	}
		});
		btnIgual.setText("=");
		btnIgual.setBounds(230, 173, 39, 27);
		
		Button btnC = new Button(shell, SWT.NONE);
		btnC.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				txtDisplay.setText("");
			}
		});
		btnC.setText("C");
		btnC.setBounds(230, 125, 39, 27);

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
