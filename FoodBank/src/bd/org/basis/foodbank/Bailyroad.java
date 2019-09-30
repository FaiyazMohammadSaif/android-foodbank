package bd.org.basis.foodbank;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class Bailyroad extends Activity {
    
	Button bfc,boomers,dosa,kfc,lorange,razzle,nawabi,pizza,shawarma,swiss,thirty ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bailyroad);
		bfc = (Button) findViewById(R.id.Button_BFC);
		boomers = (Button) findViewById(R.id.Button_BOOMERS_CAFE);
		dosa = (Button) findViewById(R.id.Button_DOSA_EXPRESS);
		kfc = (Button) findViewById(R.id.Button_KFC);
		lorange = (Button) findViewById(R.id.Button_LORANGE);
		razzle = (Button) findViewById(R.id.Button_RAZZLE);
		nawabi = (Button) findViewById(R.id.Button_NAWABI_VOJ);
		pizza = (Button) findViewById(R.id.Button_PIZZAHUT);
		shawarma = (Button) findViewById(R.id.Button_SHAWARMA_HOUSE);
		swiss = (Button) findViewById(R.id.Button_SWISS_BAKERY);
		thirty = (Button) findViewById(R.id.Button_THIRTY_THREE);
		bfc.setOnClickListener(new OnClickListener() {
	@Override
	public void onClick(View v) {
				SQLiteDatabase db = openOrCreateDatabase("BFC_Bailyroad", MODE_PRIVATE, null);
				db.execSQL("DROP TABLE IF EXISTS BFC_Bailyroad");
				db.execSQL("CREATE TABLE IF NOT EXISTS BFC_Bailyroad ( Menu VARCHAR           ,      Price VARCHAR);");
				db.execSQL("INSERT INTO BFC_Bailyroad VALUES         ( 'Food Item             ',       'Price')");
				db.execSQL("INSERT INTO BFC_Bailyroad VALUES         ( 'Fried Chicken         ',       '80TK')");
				db.execSQL("INSERT INTO BFC_Bailyroad VALUES         ( 'Chicken Burger        ',       '200TK')");
				db.execSQL("INSERT INTO BFC_Bailyroad VALUES         ( 'French Fry            ',       '50TK')");
				db.execSQL("INSERT INTO BFC_Bailyroad VALUES         ( 'Chicken Cheese Burger ',       '250TK')");
				db.execSQL("INSERT INTO BFC_Bailyroad VALUES         ( 'Chicken Wings(4 PCS)  ',       '150TK')");
				db.execSQL("INSERT INTO BFC_Bailyroad VALUES         ( 'Chicken Wings(6 PCS)  ',       '180TK')");
				db.execSQL("INSERT INTO BFC_Bailyroad VALUES         ( 'Chicken Bucket        ',       '600TK')");
				db.execSQL("INSERT INTO BFC_Bailyroad VALUES         ( 'Chicken Ball(8 PCS)   ',       '200TK')");
				db.execSQL("INSERT INTO BFC_Bailyroad VALUES         ( 'Fried Rice            ',       '150TK')");
				db.execSQL("INSERT INTO BFC_Bailyroad VALUES         ( 'Coleslaw              ',       '50TK')");
				db.execSQL("INSERT INTO BFC_Bailyroad VALUES         ( 'Drinks                ',       '40TK')");
				db.close();				
				Information.setTableName("BFC_Bailyroad");
				Information.setAddress("Address: Baily Road 1217");
				Information.setContactNum("Call: +8802-8313321");
				
				Intent intent = new Intent(Bailyroad.this,Information.class);
				startActivity(intent);
			}
		});
		
		boomers.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				SQLiteDatabase db = openOrCreateDatabase("BOOMERS_Bailyroad", MODE_PRIVATE, null);
				db.execSQL("DROP TABLE IF EXISTS BOOMERS_Bailyroad");
				db.execSQL("CREATE TABLE IF NOT EXISTS BOOMERS_Bailyroad ( Menu VARCHAR              ,       Price VARCHAR);");
				db.execSQL("INSERT INTO BOOMERS_Bailyroad VALUES         ( 'Food Item                ',       'Price')");
				db.execSQL("INSERT INTO BOOMERS_Bailyroad VALUES         ( 'Thai Soup                ',       '110TK')");
				db.execSQL("INSERT INTO BOOMERS_Bailyroad VALUES         ( 'Tandoori Chicken         ',       '700TK')");
				db.execSQL("INSERT INTO BOOMERS_Bailyroad VALUES         ( 'Plain Naan               ',       '40TK')");
				db.execSQL("INSERT INTO BOOMERS_Bailyroad VALUES         ( 'Butter Naan              ',       '45TK')");
				db.execSQL("INSERT INTO BOOMERS_Bailyroad VALUES         ( 'Spring Roll              ',       '220TK')");
				db.execSQL("INSERT INTO BOOMERS_Bailyroad VALUES         ( 'Cheese Burger            ',       '190TK')");
				db.execSQL("INSERT INTO BOOMERS_Bailyroad VALUES         ( 'Fish Burger              ',       '190TK')");
				db.execSQL("INSERT INTO BOOMERS_Bailyroad VALUES         ( 'Beef Burger              ',       '130TK')");
				db.execSQL("INSERT INTO BOOMERS_Bailyroad VALUES         ( 'Chana Masala             ',       '130TK')");
				db.execSQL("INSERT INTO BOOMERS_Bailyroad VALUES         ( 'Tandoori chicken(Half)   ',       '360TK')");
				db.execSQL("INSERT INTO BOOMERS_Bailyroad VALUES         ( 'Tandoori Chicken(Full)   ',       '700TK')");
				db.execSQL("INSERT INTO BOOMERS_Bailyroad VALUES         ( 'Beef Gordita             ',       '200TK')");
				db.close();				
				Information.setTableName("BOOMERS_Bailyroad");
				Information.setAddress("Address: 9 , New Baily Road");
				Information.setContactNum("Call: +8802-9348018");
				
				Intent intent = new Intent(Bailyroad.this,Information.class);
				startActivity(intent);
			}
		});
dosa.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				SQLiteDatabase db = openOrCreateDatabase("DOSA_Bailyroad", MODE_PRIVATE, null);
				db.execSQL("DROP TABLE IF EXISTS DOSA_Bailyroad");
				db.execSQL("CREATE TABLE IF NOT EXISTS DOSA_Bailyroad ( Menu VARCHAR          ,       Price VARCHAR);");
				db.execSQL("INSERT INTO DOSA_Bailyroad VALUES         ( 'Food Item            ',      'Price')");
				db.execSQL("INSERT INTO DOSA_Bailyroad VALUES         ( 'Plain Dosa           ',      '150TK')");
				db.execSQL("INSERT INTO DOSA_Bailyroad VALUES         ( 'Masala Dosa          ',      '200TK')");
				db.execSQL("INSERT INTO DOSA_Bailyroad VALUES         ( 'Special Masala Dosa  ',      '240TK')");
				db.execSQL("INSERT INTO DOSA_Bailyroad VALUES         ( 'Plain Uttapam        ',      '130TK')");
				db.execSQL("INSERT INTO DOSA_Bailyroad VALUES         ( 'Masala Uttapam       ',      '150TK')");
				db.execSQL("INSERT INTO DOSA_Bailyroad VALUES         ( 'Papri Chaat          ',      '115TK')");
				db.execSQL("INSERT INTO DOSA_Bailyroad VALUES         ( 'Dahi Phuchka         ',      '100TK')");
				db.execSQL("INSERT INTO DOSA_Bailyroad VALUES         ( 'Pani Puri            ',      ' 85TK')");
				db.execSQL("INSERT INTO DOSA_Bailyroad VALUES         ( 'Aloo Chaap           ',      ' 90TK')");
				db.execSQL("INSERT INTO DOSA_Bailyroad VALUES         ( 'Raj Kachori          ',    '115TK')");
				db.close();				
				Information.setTableName("DOSA_Bailyroad");
				Information.setAddress("Address: 3rd Floor, Gold Palace, 3 New Baily Road");
				Information.setContactNum("Call: +880171235934");
				
				Intent intent = new Intent(Bailyroad.this,Information.class);
				startActivity(intent);
			}
		});
kfc.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("KFC_Bailyroad", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS KFC_Bailyroad");
		db.execSQL("CREATE TABLE IF NOT EXISTS KFC_Bailyroad ( Menu VARCHAR         ,        Price VARCHAR);");
		db.execSQL("INSERT INTO KFC_Bailyroad VALUES         ( 'Food Item           ',       'Price')");
		db.execSQL("INSERT INTO KFC_Bailyroad VALUES         ( 'Fried Chicken       ',       '80TK')");
		db.execSQL("INSERT INTO KFC_Bailyroad VALUES         ( 'Chicken Burger      ',       '200TK')");
		db.execSQL("INSERT INTO KFC_Bailyroad VALUES         ( 'French Fry          ',       '50TK')");
		db.execSQL("INSERT INTO KFC_Bailyroad VALUES         ( 'Coleslaw            ',       '50TK')");
		db.execSQL("INSERT INTO KFC_Bailyroad VALUES         ( 'Ginger Burger       ',       '225TK')");
		db.execSQL("INSERT INTO KFC_Bailyroad VALUES         ( 'Vegetable Burger    ',       '200TK')");
		db.execSQL("INSERT INTO KFC_Bailyroad VALUES         ( 'Grilled Chicken     ',       '190TK')");
		db.execSQL("INSERT INTO KFC_Bailyroad VALUES         ( 'Krushers            ',       '180TK')");
		db.execSQL("INSERT INTO KFC_Bailyroad VALUES         ( 'Popcorn Chicken     ',      '100TK')");
		db.close();				
		Information.setTableName("KFC_Bailyroad");
		Information.setAddress("Address: 2nd Floor, Gold Palace, 3 New Baily Road");
		Information.setContactNum("Call: +8802-8007713");
		
		Intent intent = new Intent(Bailyroad.this,Information.class);
		startActivity(intent);
	}
});
lorange.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("LORANGE_Bailyroad", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS LORANGE_Bailyroad");
		db.execSQL("CREATE TABLE IF NOT EXISTS LORANGE_Bailyroad ( Menu VARCHAR         ,        Price VARCHAR);");
		db.execSQL("INSERT INTO LORANGE_Bailyroad VALUES         ( 'Food Item           ',       'Price')");
		db.execSQL("INSERT INTO LORANGE_Bailyroad VALUES         ( 'Wonthon             ',       '130TK')");
		db.execSQL("INSERT INTO LORANGE_Bailyroad VALUES         ( 'French Fries        ',       '120TK')");
		db.execSQL("INSERT INTO LORANGE_Bailyroad VALUES         ( 'Fish And Chips      ',       '350TK')");
		db.execSQL("INSERT INTO LORANGE_Bailyroad VALUES         ( 'Nachos              ',       '250TK')");
		db.execSQL("INSERT INTO LORANGE_Bailyroad VALUES         ( 'Thai Soup           ',       '150TK')");
		db.execSQL("INSERT INTO LORANGE_Bailyroad VALUES         ( 'Coleslaw            ',       ' 70TK')");
		db.execSQL("INSERT INTO LORANGE_Bailyroad VALUES         ( 'Mexican Rice        ',       '240TK')");
		db.execSQL("INSERT INTO LORANGE_Bailyroad VALUES         ( 'Plain Parata        ',       ' 40TK')");
		db.execSQL("INSERT INTO LORANGE_Bailyroad VALUES         ( 'Chicken Pasta       ',       '280TK')");
		db.close();				
		Information.setTableName("LORANGE_Bailyroad");
		Information.setAddress("Address: 8 , New Baily Road");
		Information.setContactNum("Call: +8802-9348018");
		
		Intent intent = new Intent(Bailyroad.this,Information.class);
		startActivity(intent);
	}
});
razzle.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("RAZZLE_Bailyroad", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS RAZZLE_Bailyroad");
		db.execSQL("CREATE TABLE IF NOT EXISTS RAZZLE_Bailyroad ( Menu VARCHAR          ,        Price VARCHAR);");
		db.execSQL("INSERT INTO RAZZLE_Bailyroad VALUES         ( 'Food Item            ',       'Price')");
		db.execSQL("INSERT INTO RAZZLE_Bailyroad VALUES         ( 'Chicken Burger       ',       '110TK')");
		db.execSQL("INSERT INTO RAZZLE_Bailyroad VALUES         ( 'Beef Burger          ',       '120TK')");
		db.execSQL("INSERT INTO RAZZLE_Bailyroad VALUES         ( 'Razzle Chicken Pizza ',       '440TK')");
		db.execSQL("INSERT INTO RAZZLE_Bailyroad VALUES         ( 'Chicken BBQ Pizza    ',       '450TK')");
		db.execSQL("INSERT INTO RAZZLE_Bailyroad VALUES         ( 'Veggie Pizza         ',       '330TK')");
		db.execSQL("INSERT INTO RAZZLE_Bailyroad VALUES         ( 'Mixed Salad          ',       '100TK')");
		db.execSQL("INSERT INTO RAZZLE_Bailyroad VALUES         ( 'Fried Chicken        ',       ' 90TK')");
		db.execSQL("INSERT INTO RAZZLE_Bailyroad VALUES         ( 'French Fry           ',       ' 65TK')");
		db.execSQL("INSERT INTO RAZZLE_Bailyroad VALUES         ( 'Coleslaw             ',       ' 35TK')");
		db.close();				
		Information.setTableName("RAZZLE_Bailyroad");
		Information.setAddress("Address: 143/2 New Baily Road");
		Information.setContactNum("Call: +8802-9348018");
		
		Intent intent = new Intent(Bailyroad.this,Information.class);
		startActivity(intent);
	}
});
nawabi.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("NAWABI_Bailyroad", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS NAWABI_Bailyroad");
		db.execSQL("CREATE TABLE IF NOT EXISTS NAWABI_Bailyroad ( Menu VARCHAR              ,        Price VARCHAR);");
		db.execSQL("INSERT INTO NAWABI_Bailyroad VALUES         ( 'Food Item               ',       'Price')");
		db.execSQL("INSERT INTO NAWABI_Bailyroad VALUES         ( 'Kachi Biriyani          ',       '160TK')");
		db.execSQL("INSERT INTO NAWABI_Bailyroad VALUES         ( 'Chicken Biriyani        ',       '150TK')");
		db.execSQL("INSERT INTO NAWABI_Bailyroad VALUES         ( 'Chicken Jhal Fry        ',       '110TK')");
		db.execSQL("INSERT INTO NAWABI_Bailyroad VALUES         ( 'Beef Shahi Korai        ',       '450TK')");
		db.execSQL("INSERT INTO NAWABI_Bailyroad VALUES         ( 'Chicken Tikka           ',       '190TK')");
		db.execSQL("INSERT INTO NAWABI_Bailyroad VALUES         ( 'Chicken Shawarma        ',       '130TK')");
		db.execSQL("INSERT INTO NAWABI_Bailyroad VALUES         ( 'Nawabi Parata           ',       ' 40TK')");
		db.execSQL("INSERT INTO NAWABI_Bailyroad VALUES         ( 'Butter Naan             ',       ' 40TK')");
		db.execSQL("INSERT INTO NAWABI_Bailyroad VALUES         ( 'Special Sabji           ',       ' 40TK')");
		db.execSQL("INSERT INTO NAWABI_Bailyroad VALUES         ( 'Chicken Roast           ',       '120TK')");
		db.execSQL("INSERT INTO NAWABI_Bailyroad VALUES         ( 'Chicken Khichuri(Half)  ',       '150TK')");
		db.execSQL("INSERT INTO NAWABI_Bailyroad VALUES         ( 'Chicken Khichuri(Full)  ',       '250TK')");
		db.close();				
		Information.setTableName("NAWABI_Bailyroad");
		Information.setAddress("Address: 15 , New Baily Road");
		Information.setContactNum("Call: +8802-9348018");
		
		Intent intent = new Intent(Bailyroad.this,Information.class);
		startActivity(intent);
	}
});
pizza.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("PIZZA_Bailyroad", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS PIZZA_Bailyroad");
		db.execSQL("CREATE TABLE IF NOT EXISTS PIZZA_Bailyroad ( Menu VARCHAR               ,        Price VARCHAR);");
		db.execSQL("INSERT INTO PIZZA_Bailyroad VALUES         ( 'Food Item                 ',       'Price')");
		db.execSQL("INSERT INTO PIZZA_Bailyroad VALUES         ( 'Chicken Pizza             ',       '320TK')");
		db.execSQL("INSERT INTO PIZZA_Bailyroad VALUES         ( 'Beef Pizza                ',       '3200TK')");
		db.execSQL("INSERT INTO PIZZA_Bailyroad VALUES         ( 'Napoliana                 ',       '350TK')");
		db.execSQL("INSERT INTO PIZZA_Bailyroad VALUES         ( 'Vegetable Pizza           ',       '310TK')");
		db.execSQL("INSERT INTO PIZZA_Bailyroad VALUES         ( 'BBQ Chicken Pizza         ',       '280TK')");
		db.execSQL("INSERT INTO PIZZA_Bailyroad VALUES         ( 'Chicken Cheese Pizza      ',       '200TK')");
		db.execSQL("INSERT INTO PIZZA_Bailyroad VALUES         ( 'Beef Cheese Pizza         ',       '250TK')");
		db.execSQL("INSERT INTO PIZZA_Bailyroad VALUES         ( 'BBQ With Mushroom Pizza   ',       '310TK')");
		db.execSQL("INSERT INTO PIZZA_Bailyroad VALUES         ( 'BBQ Chicken Pizza         ',       '280TK')");
		db.execSQL("INSERT INTO PIZZA_Bailyroad VALUES         ( 'Brownie With Icecream     ',       '300TK')");
		db.execSQL("INSERT INTO PIZZA_Bailyroad VALUES         ( 'Potato Wedges             ',       '150TK')");
		db.execSQL("INSERT INTO PIZZA_Bailyroad VALUES         ( 'Coleslaw                  ',       ' 50TK')");
		db.close();				
		Information.setTableName("PIZZA_Bailyroad");
		Information.setAddress("Address: 2nd Floor, Gold Palace, 3 New Baily Road");
		Information.setContactNum("Call: +8802-8317099");
		
		Intent intent = new Intent(Bailyroad.this,Information.class);
		startActivity(intent);
	}
});
shawarma.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("SHAWARMA_Bailyroad", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS SHAWARMA_Bailyroad");
		db.execSQL("CREATE TABLE IF NOT EXISTS SHAWARMA_Bailyroad ( Menu VARCHAR              ,        Price VARCHAR);");
		db.execSQL("INSERT INTO SHAWARMA_Bailyroad VALUES         ( 'Food Item                ',       'Price')");
		db.execSQL("INSERT INTO SHAWARMA_Bailyroad VALUES         ( 'Chicken Arabian Shawarma ',       '110TK')");
		db.execSQL("INSERT INTO SHAWARMA_Bailyroad VALUES         ( 'Beef Arabian Shawarma    ',       '110TK')");
		db.execSQL("INSERT INTO SHAWARMA_Bailyroad VALUES         ( 'French Fry               ',       '50TK')");
		db.execSQL("INSERT INTO SHAWARMA_Bailyroad VALUES         ( 'Coleslaw                 ',       '50TK')");
		db.execSQL("INSERT INTO SHAWARMA_Bailyroad VALUES         ( 'Chicken Wrap Shawarma    ',       '170TK')");
		db.execSQL("INSERT INTO SHAWARMA_Bailyroad VALUES         ( 'Beef Wrap Shawarma       ',       '175TK')");
		db.execSQL("INSERT INTO SHAWARMA_Bailyroad VALUES         ( 'Shrimp Pizza Sandwich    ',       '280TK')");
		db.execSQL("INSERT INTO SHAWARMA_Bailyroad VALUES         ( 'Thai Style Noodles       ',       '130TK')");
		db.execSQL("INSERT INTO SHAWARMA_Bailyroad VALUES         ( 'Garlic Naan              ',       ' 60TK')");
		db.execSQL("INSERT INTO SHAWARMA_Bailyroad VALUES         ( 'Kashmiri Naan            ',       ' 80TK')");
		db.execSQL("INSERT INTO SHAWARMA_Bailyroad VALUES         ( 'Chicken Shashlik         ',       '140TK')");
		db.execSQL("INSERT INTO SHAWARMA_Bailyroad VALUES         ( 'Tandoori Chicken         ',       '150TK')");
		db.close();				
		Information.setTableName("SHAWARMA_Bailyroad");
		Information.setAddress("Address: 8 , New Baily Road");
		Information.setContactNum("Call: +880176567713");
		
		Intent intent = new Intent(Bailyroad.this,Information.class);
		startActivity(intent);
	}
});
swiss.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("SWISS_Bailyroad", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS SWISS_Bailyroad");
		db.execSQL("CREATE TABLE IF NOT EXISTS SWISS_Bailyroad ( Menu VARCHAR         ,        Price VARCHAR);");
		db.execSQL("INSERT INTO SWISS_Bailyroad VALUES         ( 'Food Item           ',       'Price')");
		db.execSQL("INSERT INTO SWISS_Bailyroad VALUES         ( 'Chicken Roll        ',        '55TK')");
		db.execSQL("INSERT INTO SWISS_Bailyroad VALUES         ( 'Chicken Patties     ',        '55TK')");
		db.execSQL("INSERT INTO SWISS_Bailyroad VALUES         ( 'Slice Cake          ',        '20TK')");
		db.execSQL("INSERT INTO SWISS_Bailyroad VALUES         ( 'Chocolate Roll      ',        '35TK')");
		db.execSQL("INSERT INTO SWISS_Bailyroad VALUES         ( 'Fried Chicken       ',        '80TK')");
		db.execSQL("INSERT INTO SWISS_Bailyroad VALUES         ( 'Chicken Burger      ',        '200TK')");
		db.execSQL("INSERT INTO SWISS_Bailyroad VALUES         ( 'Chicken Sandwich    ',        ' 50TK')");
		db.execSQL("INSERT INTO SWISS_Bailyroad VALUES         ( 'Chicken Pizza       ',        '150TK')");
		db.execSQL("INSERT INTO SWISS_Bailyroad VALUES         ( 'Hot Dog             ',        '100TK')");
		db.execSQL("INSERT INTO SWISS_Bailyroad VALUES         ( 'Chicken Stick       ',        ' 40TK')");
		db.close();				
		Information.setTableName("SWISS_Bailyroad");
		Information.setAddress("Address: 4 , New Baily Road");
		Information.setContactNum("Call: +8802-8050901");
		
		Intent intent = new Intent(Bailyroad.this,Information.class);
		startActivity(intent);
	}
});
thirty.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("THIRTYTHREE_Bailyroad", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS THIRTYTHREE_Bailyroad");
		db.execSQL("CREATE TABLE IF NOT EXISTS THIRTYTHREE_Bailyroad ( Menu VARCHAR         ,        Price VARCHAR);");
		db.execSQL("INSERT INTO THIRTYTHREE_Bailyroad VALUES         ( 'Food Item           ',       'Price')");
		db.execSQL("INSERT INTO THIRTYTHREE_Bailyroad VALUES         ( 'Fried Chicken       ',       ' 83TK')");
		db.execSQL("INSERT INTO THIRTYTHREE_Bailyroad VALUES         ( 'Chicken Burger      ',       '203TK')");
		db.execSQL("INSERT INTO THIRTYTHREE_Bailyroad VALUES         ( 'French Fry          ',       ' 53TK')");
		db.execSQL("INSERT INTO THIRTYTHREE_Bailyroad VALUES         ( 'Coleslaw            ',       ' 53TK')");
		db.execSQL("INSERT INTO THIRTYTHREE_Bailyroad VALUES         ( 'Grill Chicken       ',       '183TK')");
		db.execSQL("INSERT INTO THIRTYTHREE_Bailyroad VALUES         ( 'Beef Burger         ',       '203TK')");
		db.execSQL("INSERT INTO THIRTYTHREE_Bailyroad VALUES         ( 'Fried Rice          ',       '193TK')");
		db.execSQL("INSERT INTO THIRTYTHREE_Bailyroad VALUES         ( 'Reshmi Kabab        ',       '403TK')");
		db.execSQL("INSERT INTO THIRTYTHREE_Bailyroad VALUES         ( 'Fish Tikka          ',       '473TK')");
		db.execSQL("INSERT INTO THIRTYTHREE_Bailyroad VALUES         ( 'Paneer Tikka        ',       '673TK')");
		db.execSQL("INSERT INTO THIRTYTHREE_Bailyroad VALUES         ( 'Kabuli Naan         ',       '103TK')");
		db.execSQL("INSERT INTO THIRTYTHREE_Bailyroad VALUES         ( 'Sabzi Ka Mela       ',       '273TK')");
		db.close();				
		Information.setTableName("THIRTYTHREE_Bailyroad");
		Information.setAddress("Address: 3rd Floor, Gold Palace, 3 New Baily Road");
		Information.setContactNum("Call: +8802-9348018");
		
		Intent intent = new Intent(Bailyroad.this,Information.class);
		startActivity(intent);
	}
});
	}  

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bailyroad, menu);
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
