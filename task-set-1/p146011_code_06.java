// p146011@nu.edu.pk

import java.awt.*;
import javax.swing.*;

public class p146011_code_06 {

    p146011_code_06() {
        JFrame frame = new JFrame("Find Replace");
        frame.setLocation(100, 100);
        frame.setSize(600, 250);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel lbl_find_what = new JLabel("Find What: ");
        JLabel lbl_replace_with = new JLabel("Replace With: ");

        JTextField find_what = new JTextField();
        JTextField replace_with = new JTextField();

        JCheckBox mat_cas = new JCheckBox("Match Case");
        JCheckBox who_wor = new JCheckBox("Whole Words");
        JCheckBox reg_exp = new JCheckBox("Regular Expressions");
        
        JCheckBox hig_res = new JCheckBox("Highlight Results");
        hig_res.setSelected(true);

        JCheckBox wra_aro = new JCheckBox("Wrap Around");
        wra_aro.setSelected(true);

        JCheckBox sea_sel = new JCheckBox("Search Selection");
        sea_sel.setEnabled(false);

        JCheckBox sea_bac = new JCheckBox("Search Backwards");

        JCheckBox inc_sea = new JCheckBox("Incremental Search");
        inc_sea.setSelected(true);

        JButton find = new JButton("Find");
        JButton replace = new JButton("Replace");
        JButton replace_all = new JButton("Replace All");
        JButton close = new JButton("Close");
        JButton help = new JButton("Help");

        GroupLayout layout = new GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(lbl_find_what)
                .addComponent(lbl_replace_with)
            )
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(find_what)
                .addComponent(replace_with)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(mat_cas)
                        .addComponent(who_wor)
                        .addComponent(reg_exp)
                        .addComponent(hig_res))
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(wra_aro)
                        .addComponent(sea_sel)
                        .addComponent(sea_bac)
                        .addComponent(inc_sea)
                    )
                )
            )
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(find)
                .addComponent(replace)
                .addComponent(replace_all)
                .addComponent(close)
                .addComponent(help)
            )
        );

        layout.linkSize(SwingConstants.HORIZONTAL, find, replace, replace_all, close, help);
        
        layout.setVerticalGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(lbl_find_what)
                .addComponent(find_what)
                .addComponent(find))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(lbl_replace_with)
                .addComponent(replace_with)
                .addComponent(replace))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(mat_cas)
                        .addComponent(wra_aro)
                        .addComponent(replace_all)
                    )
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(who_wor)
                        .addComponent(sea_sel)
                        .addComponent(close)
                    )
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(reg_exp)
                        .addComponent(sea_bac)
                        .addComponent(help)
                    )
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(hig_res)
                        .addComponent(inc_sea)
                    )
                )
            )
        );

        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        p146011_code_06 window = new p146011_code_06();
    }

}