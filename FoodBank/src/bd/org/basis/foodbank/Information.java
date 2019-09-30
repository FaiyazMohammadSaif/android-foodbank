package bd.org.basis.foodbank;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Information extends Activity {
	TextView txtfood,txtadd,txtcall;
	String typ ,  cost;
	static String table = "table";
	static String ContactNum = "number";
	static String Address="address";
	
	public static void setTableName(String a)
	{
		table = a;
	}
	
	public String getTableName(){
		return table;
	}
	
	public static void setContactNum(String a)
	{
		ContactNum = a;
	}
	public String getContactNum(){
		return ContactNum;
	}
	public static void setAddress(String a)
	{
		Address = a;
	}
	
	public String getAddress(){
		return Address;
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_all_food);
		
		txtfood = (TextView) findViewById(R.id.Text_FOOD_ITEM);
		txtadd = (TextView) findViewById(R.id.Text_ADDRESS);
		txtcall=(TextView) findViewById(R.id.Text_CALL);
		
		txtadd.setText(getAddress());
		txtcall.setText(getContactNum());
		

		try{
				SQLiteDatabase db2 = openOrCreateDatabase(getTableName() , MODE_PRIVATE, null);
				final Cursor cursor = db2.rawQuery("SELECT * FROM "+getTableName(), null);
			
		    
				txtfood.setText("\n");
				cursor.moveToFirst();
				do
				{
					typ = cursor.getString(0);
					cost = cursor.getString(1);
					
					txtfood.append(typ +"  "+ cost +"\n\n");

					
				}while(cursor.moveToNext());
				db2.close();
				
			}catch(Exception e){
				e.printStackTrace();
			}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.information, menu);
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


