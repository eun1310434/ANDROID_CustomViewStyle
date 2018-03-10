/*=====================================================================
□ Infomation
  ○ Data : 10.03.2018
  ○ Mail : eun1310434@naver.com
  ○ Blog : https://blog.naver.com/eun1310434
  ○ Reference : Do it android app Programming

□ Function
  ○  다양한 스타일의 그래픽을 그리기

□ Study
  ○
=====================================================================*/
package com.eun1310434.customviewstyle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 뷰를 화면 설정
        CustomViewStyles myView = new CustomViewStyles(this);
        setContentView(myView);
    }

}
