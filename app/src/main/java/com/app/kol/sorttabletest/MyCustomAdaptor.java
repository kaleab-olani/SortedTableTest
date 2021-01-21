package com.app.kol.sorttabletest;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import de.codecrafters.tableview.TableDataAdapter;

public class MyCustomAdaptor extends TableDataAdapter<SampleClass> {

    public MyCustomAdaptor(Context context, List<SampleClass> data) {
        super(context, data);
    }

    @Override
    public View getCellView(int rowIndex, int columnIndex, ViewGroup parentView) {
        SampleClass data = getRowData(rowIndex);
        TextView renderedView = new TextView(getContext());

        switch (columnIndex) {
            case 0:
                renderedView.setText(String.valueOf(data.getId()));
                break;
            case 1:
                renderedView.setText(data.getName());
                break;
            case 2:
                renderedView.setText(String.valueOf(data.getGender()));
                break;
            case 3:
                renderedView.setText(String.valueOf(data.isAlive()));
                break;
        }
        return renderedView;
    }
}