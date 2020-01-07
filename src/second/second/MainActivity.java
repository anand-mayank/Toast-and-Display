package second.second;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	Button c,s;
	EditText et;
	TextView tv;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		c=(Button)findViewById(R.id.button2);
		s=(Button)findViewById(R.id.button1);
		et=(EditText)findViewById(R.id.editText1);
		tv=(TextView)findViewById(R.id.textView1);
		c.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String mydata=et.getText().toString();
						tv.setText(""+mydata);
				// TODO Auto-generated method stub
				
			}
		});
		s.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			String mystr=et.getText().toString();
			Toast.makeText(getApplicationContext(), ""+mystr, Toast.LENGTH_LONG).show();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
