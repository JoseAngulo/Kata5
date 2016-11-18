package moneycalculator;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JFrame;
import moneycalculator.model.ui.swing.SwingMoneyDisplay;
import moneycalculator.ui.MoneyDisplay;

public class MainFrame extends JFrame {
    
    private MoneyDisplay moneyDisplay;

    
    public MainFrame(){
        
        setTitle("Money Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        add(moneyDisplayPanel(),BorderLayout.NORTH);
        setVisible(true);
        
        
        
    }
    
    
    public MoneyDisplay moneyDisplay(){
        return moneyDisplay;
    }

    private Component moneyDisplayPanel() {
        SwingMoneyDisplay display = new SwingMoneyDisplay();
        this.moneyDisplay = display;
        return display;
        
        
        
    }
            
    
}
