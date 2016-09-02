package cn.edu.bistu.cs.se.zuoye6context;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.EditText;

public class MainActivity extends Activity {
    private EditText editText01=null;
    private EditText editText02=null;

    private final int MENU1 = 1;
    private final int MENU2 = 2;
    private final int MENU3 = 3;
    private final int MENU4 = 4;
    private final int MENU5 = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText01=(EditText)findViewById(R.id.editText01);
        editText02=(EditText)findViewById(R.id.editText02);

        //为View对象注册上下文菜单
        this.registerForContextMenu(editText01);
        this.registerForContextMenu(editText02);
    }

    /**
     * 初始化上下文菜单
     *
     * 每次调出上下文菜单时都会被调用一次
     */
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenuInfo menuInfo) {
        //menu.setHeaderIcon(R.drawable.header);
        switch (v.getId()) {
            case R.id.editText01:
                menu.add(0, MENU1, 0, "学号：0001");
                menu.add(0, MENU2, 0, "性别：女");
                menu.add(0, MENU3, 0, "专业：软工");
                break;
            case R.id.editText02:
                menu.add(0, MENU4, 0, "学号0002");
                menu.add(0, MENU5, 0, "性别：男");
                break;
        }
        //super.onCreateContextMenu(menu, v, menuInfo);
    }

}