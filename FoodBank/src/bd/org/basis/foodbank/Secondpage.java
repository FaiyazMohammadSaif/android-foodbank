package bd.org.basis.foodbank;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Secondpage extends Activity {
    
	Button baily,banani,dhanmondi,gulshan,mirpur,uttara ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_secondpage);
		
		baily= (Button) findViewById (R.id.Button_BailyRoad);
		banani=(Button) findViewById (R.id.Button_Banani);
		dhanmondi=(Button) findViewById (R.id.Button_Dhanmondi);
		gulshan=(Button) findViewById (R.id.Button_Gulshan);
		mirpur=(Button) findViewById (R.id.Button_Mirpur);
		uttara=(Button) findViewById (R.id.Button_Uttara);
	
	    baily.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(Secondpage.this,Bailyroad.class);
				startActivity(intent);
				
			}
		});
       banani.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(Secondpage.this,Banani.class);
				startActivity(intent);
				
			}
		});
       dhanmondi.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(Secondpage.this,Dhanmondi.class);
				startActivity(intent);
				
			}
		});
       gulshan.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(Secondpage.this,Gulshan.class);
				startActivity(intent);
				
			}
		});
       uttara.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(Secondpage.this,Uttara.class);
				startActivity(intent);
				
			}
		});
       mirpur.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(Secondpage.this,Mirpur.class);
				startActivity(intent);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.secondpage, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
