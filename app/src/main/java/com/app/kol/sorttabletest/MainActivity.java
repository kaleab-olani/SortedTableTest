package com.app.kol.sorttabletest;

import androidx.appcompat.app.AppCompatActivity;
import de.codecrafters.tableview.SortableTableView;
import de.codecrafters.tableview.model.TableColumnDpWidthModel;
import de.codecrafters.tableview.model.TableColumnWeightModel;
import de.codecrafters.tableview.toolkit.SimpleTableHeaderAdapter;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private SortableTableView<SampleClass> tableView;
    private String[] tableHeaders = new String[]{"Id", "Name", "Gender" ,"Alive"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tableView =  findViewById(R.id.tableView);
        setUpTable();
    }

    private void setUpTable() {
        tableView.setColumnCount(4);

        TableColumnWeightModel columnModel = new TableColumnWeightModel(4);
        columnModel.setColumnWeight(0, 1);
        columnModel.setColumnWeight(1, 5);
        columnModel.setColumnWeight(2, 1);
        columnModel.setColumnWeight(3, 1);
        tableView.setColumnModel(columnModel);


        tableView.setEmptyDataIndicatorView(findViewById(R.id.empty_data_indicator));
        tableView.setHeaderAdapter(new SimpleTableHeaderAdapter(this, tableHeaders));
        tableView.setDataAdapter(new MyCustomAdaptor(this,SampleClass.getData(100)));

        tableView.setColumnComparator(0, new SampleClass.SampleClassIDComparator());
        tableView.setColumnComparator(1, new SampleClass.SampleClassNameComparator());
        tableView.setColumnComparator(2, new SampleClass.SampleClassGenderComparator());
        tableView.setColumnComparator(3, new SampleClass.SampleClassAliveComparator());

    }
}
