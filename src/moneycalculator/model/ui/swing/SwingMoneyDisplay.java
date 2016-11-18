package moneycalculator.model.ui.swing;

import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import moneycalculator.model.Money;
import moneycalculator.ui.MoneyDisplay;

public class SwingMoneyDisplay extends JPanel implements MoneyDisplay {

    public SwingMoneyDisplay() {
        setLayout(new FlowLayout());
    }
    
    @Override
    public void display(Money money) {
        removeAll();
        add(amount(money.getAmount()));
        add(currency(money.getCurrency().getCode()));
    }

    private Component amount(double amount){
        return new JLabel(String.valueOf(amount));
    }
    
    private Component currency(String code){
        return new JLabel(code);
    }
    
    
    
    
}
