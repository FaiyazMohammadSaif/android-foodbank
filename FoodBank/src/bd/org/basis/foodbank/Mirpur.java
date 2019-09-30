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

public class Mirpur extends Activity {
    
	Button american,americanfried,combo,city,goodys,jinlia,peoples,sigree,western;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mirpur);
		american=(Button)findViewById(R.id.Button_AMERICAN_BURGER_MIRPUR);
		americanfried=(Button)findViewById(R.id.Button_AMERICAN_FRIED_CHICKEN);
		combo=(Button)findViewById(R.id.Button_CAFE_COMBO);
		city=(Button)findViewById(R.id.Button_CITY_LOUNGE);
		goodys=(Button)findViewById(R.id.Button_GOODYS);
		jinlia=(Button)findViewById(R.id.Button_JINLIA_RESTAURANT);
		peoples=(Button)findViewById(R.id.Button_PEOPLES_FOOD_CORNER);
		sigree=(Button)findViewById(R.id.Button_SIGREE);
		western=(Button)findViewById(R.id.Button_WESTERN_GRILL);
american.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				SQLiteDatabase db = openOrCreateDatabase("american_mirpur", MODE_PRIVATE, null);
				db.execSQL("DROP TABLE IF EXISTS american_mirpur");
				db.execSQL("CREATE TABLE IF NOT EXISTS american_mirpur ( Menu VARCHAR                  ,       Price VARCHAR);");
				db.execSQL("INSERT INTO american_mirpur VALUES         ( 'Food Item                    ',       'Price')");
				db.execSQL("INSERT INTO american_mirpur VALUES         ( 'Fajitas                      ',       '140TK')");
				db.execSQL("INSERT INTO american_mirpur VALUES         ( 'Ranchi Chicken Taco          ',       '140TK')");
				db.execSQL("INSERT INTO american_mirpur VALUES         ( 'Gordita Chicken Taco         ',       '145TK')");
				db.execSQL("INSERT INTO american_mirpur VALUES         ( 'Nachos Supreme               ',       '170TK')");
				db.execSQL("INSERT INTO american_mirpur VALUES         ( 'Spicy Chicken Burrito        ',       '155TK')");
				db.execSQL("INSERT INTO american_mirpur VALUES         ( 'Quesadilla(Chicken)          ',       '155TK')");
				db.execSQL("INSERT INTO american_mirpur VALUES         ( 'Quesadilla(Beef)             ',       '165TK')");
				db.execSQL("INSERT INTO american_mirpur VALUES         ( 'Cheesy Fiesta Potatoes       ',       '100TK')");
				db.execSQL("INSERT INTO american_mirpur VALUES         ( 'Pambazo                      ',       '130TK')");
				db.execSQL("INSERT INTO american_mirpur VALUES         ( 'Mexican Bowl                 ',       '220TK')");
				db.close();				
				Information.setTableName("american_mirpur");
				Information.setAddress("Address:   House No-2/B, Road No-12, Mirpur Road");
				Information.setContactNum("Call: 01911733167");
				
				Intent intent = new Intent(Mirpur.this,Information.class);
				startActivity(intent);
			}
		});
americanfried.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("americanfried_mirpur", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS americanfried_mirpur");
		db.execSQL("CREATE TABLE IF NOT EXISTS americanfried_mirpur ( Menu VARCHAR                    ,       Price VARCHAR);");
		db.execSQL("INSERT INTO americanfried_mirpur VALUES         ( 'Food Item                     ',       'Price')");
		db.execSQL("INSERT INTO americanfried_mirpur VALUES         ( 'Bar-B-Q Chicken Meal          ',       '300TK')");
		db.execSQL("INSERT INTO americanfried_mirpur VALUES         ( 'Fried Chicken Meal            ',       '190TK')");
		db.execSQL("INSERT INTO americanfried_mirpur VALUES         ( 'Chicken Stir Fry Meal         ',       '290TK')");
		db.execSQL("INSERT INTO americanfried_mirpur VALUES         ( 'Student Meal                  ',       '200TK')");
		db.execSQL("INSERT INTO americanfried_mirpur VALUES         ( 'Tower Burger                  ',       '325TK')");
		db.execSQL("INSERT INTO americanfried_mirpur VALUES         ( 'Grill Chicken Burger          ',       '235TK')");
		db.execSQL("INSERT INTO americanfried_mirpur VALUES         ( 'Grab & Go Special Burger      ',       '250TK')");
		db.execSQL("INSERT INTO americanfried_mirpur VALUES         ( 'Pop Chicken 12 Pcs            ',       '200TK')");
		db.execSQL("INSERT INTO americanfried_mirpur VALUES         ( 'Cheesy Chicken Roll           ',       '100TK')");
		db.execSQL("INSERT INTO americanfried_mirpur VALUES         ( 'Chicken Egg Roll              ',       '125TK')");
		db.close();				
		Information.setTableName("americanfried_mirpur");
		Information.setAddress("Address: Block-B,Mirpur");
		Information.setContactNum("Call: 02-9014393");
		
		Intent intent = new Intent(Mirpur.this,Information.class);
		startActivity(intent);
	}
});
combo.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("combo_mirpur", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS combo_mirpur");
		db.execSQL("CREATE TABLE IF NOT EXISTS combo_mirpur ( Menu VARCHAR                ,       Price VARCHAR);");
		db.execSQL("INSERT INTO combo_mirpur VALUES         ( 'Food Item                 ',       'Price')");
		db.execSQL("INSERT INTO combo_mirpur VALUES         ( 'Chocolate Cupcake         ',       '100TK')");
		db.execSQL("INSERT INTO combo_mirpur VALUES         ( 'Brownie                   ',       '120TK')");
		db.execSQL("INSERT INTO combo_mirpur VALUES         ( 'Pretzels                  ',       ' 70TK')");
		db.execSQL("INSERT INTO combo_mirpur VALUES         ( 'German Chicken            ',       '150TK')");
		db.execSQL("INSERT INTO combo_mirpur VALUES         ( 'BBQ Chicken               ',       '165TK')");
		db.execSQL("INSERT INTO combo_mirpur VALUES         ( 'Chinatown Dog             ',       '120TK')");
		db.execSQL("INSERT INTO combo_mirpur VALUES         ( 'Astoria Dog               ',       '120TK')");
		db.execSQL("INSERT INTO combo_mirpur VALUES         ( 'Wall Street Dog           ',       '120TK')");
		db.execSQL("INSERT INTO combo_mirpur VALUES         ( 'Coney Island Dog          ',       '120TK')");
		db.execSQL("INSERT INTO combo_mirpur VALUES         ( 'Hell’s Kitchen Dawg       ',       '120TK')");
		db.close();				
		Information.setTableName("combo_mirpur");
		Information.setAddress("Address:  House: 14, Road: 3, Block: A, Mirpur 10 ");
		Information.setContactNum("Call: 01717-341690");
		
		Intent intent = new Intent(Mirpur.this,Information.class);
		startActivity(intent);
	}
});
city.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("city_mirpur", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS city_mirpur");
		db.execSQL("CREATE TABLE IF NOT EXISTS city_mirpur ( Menu VARCHAR                ,       Price VARCHAR);");
		db.execSQL("INSERT INTO city_mirpur VALUES         ( 'Food Item                 ',       'Price')");
		db.execSQL("INSERT INTO city_mirpur VALUES         ( 'Thai Spring Roll          ',       '240TK')");
		db.execSQL("INSERT INTO city_mirpur VALUES         ( 'Thai Noodles Soup         ',       '360TK')");
		db.execSQL("INSERT INTO city_mirpur VALUES         ( 'Thai Mixed Vegetable      ',       '275TK')");
		db.execSQL("INSERT INTO city_mirpur VALUES         ( 'Fantasy Rice              ',       '290TK')");
		db.execSQL("INSERT INTO city_mirpur VALUES         ( 'Fried Wonthons            ',       '220TK')");
		db.execSQL("INSERT INTO city_mirpur VALUES         ( 'Fried Fish Finger         ',       '320TK')");
		db.execSQL("INSERT INTO city_mirpur VALUES         ( 'Chicken Corn Soup         ',       '220TK')");
		db.execSQL("INSERT INTO city_mirpur VALUES         ( 'Lemon Chicken             ',       '295TK')");
		db.execSQL("INSERT INTO city_mirpur VALUES         ( 'Sizzling Chicken          ',       '390TK')");
		db.execSQL("INSERT INTO city_mirpur VALUES         ( 'Prawn Masalla             ',       '390TK')");
		db.close();				
		Information.setTableName("city_mirpur");
		Information.setAddress("Address: Setara-Convention Tower, Pallabi, Mirpur ");
		Information.setContactNum("Call: +880 1786-064031");
		
		Intent intent = new Intent(Mirpur.this,Information.class);
		startActivity(intent);
	}
});
goodys.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("goodys_mirpur", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS goodys_mirpur");
		db.execSQL("CREATE TABLE IF NOT EXISTS goodys_mirpur ( Menu VARCHAR                ,       Price VARCHAR);");
		db.execSQL("INSERT INTO goodys_mirpur VALUES         ( 'Food Item                 ',       'Price')");
		db.execSQL("INSERT INTO goodys_mirpur VALUES         ( 'Chicken Cashewnut Salad   ',       '245TK')");
		db.execSQL("INSERT INTO goodys_mirpur VALUES         ( 'Cucumber Salad            ',       '150TK')");
		db.execSQL("INSERT INTO goodys_mirpur VALUES         ( 'Egg Fried Rice            ',       '150TK')");
		db.execSQL("INSERT INTO goodys_mirpur VALUES         ( 'Masala Fried Rice         ',       '170TK')");
		db.execSQL("INSERT INTO goodys_mirpur VALUES         ( 'Chicken Chilli Onion      ',       '150TK')");
		db.execSQL("INSERT INTO goodys_mirpur VALUES         ( 'Prawn Sizzling            ',       '200TK')");
		db.execSQL("INSERT INTO goodys_mirpur VALUES         ( 'Beef Masala               ',       '180TK')");
		db.execSQL("INSERT INTO goodys_mirpur VALUES         ( 'Special Shwarma           ',       '170TK')");
		db.execSQL("INSERT INTO goodys_mirpur VALUES         ( 'Special Sandwich          ',       '150TK')");
		db.execSQL("INSERT INTO goodys_mirpur VALUES         ( 'Chicken Sandwich          ',       '115TK')");
		db.close();				
		Information.setTableName("goodys_mirpur");
		Information.setAddress("Address:  Section# 06, Block# KA, Plot#17, Mirpur ");
		Information.setContactNum("Call: 01681-002211");
		
		Intent intent = new Intent(Mirpur.this,Information.class);
		startActivity(intent);
	}
});
jinlia.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("jinlia_mirpur", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS jinlia_mirpur");
		db.execSQL("CREATE TABLE IF NOT EXISTS jinlia_mirpur ( Menu VARCHAR                ,       Price VARCHAR);");
		db.execSQL("INSERT INTO jinlia_mirpur VALUES         ( 'Food Item                 ',       'Price')");
		db.execSQL("INSERT INTO jinlia_mirpur VALUES         ( 'Mutton Nehari             ',       '350TK')");
		db.execSQL("INSERT INTO jinlia_mirpur VALUES         ( 'Mutton Masala             ',       '400TK')");
		db.execSQL("INSERT INTO jinlia_mirpur VALUES         ( 'Mutton Korma              ',       '400TK')");
		db.execSQL("INSERT INTO jinlia_mirpur VALUES         ( 'Fish Karai                ',       '430TK')");
		db.execSQL("INSERT INTO jinlia_mirpur VALUES         ( 'Fish Dopiaza              ',       '430TK')");
		db.execSQL("INSERT INTO jinlia_mirpur VALUES         ( 'Fried Pomfret             ',       '450TK')");
		db.execSQL("INSERT INTO jinlia_mirpur VALUES         ( 'Chicken Korma             ',       '350TK')");
		db.execSQL("INSERT INTO jinlia_mirpur VALUES         ( 'Chicken Makhani           ',       '350TK')");
		db.execSQL("INSERT INTO jinlia_mirpur VALUES         ( 'Beef Achari               ',       '290TK')");
		db.execSQL("INSERT INTO jinlia_mirpur VALUES         ( 'Paneer Kulcha             ',       ' 80TK')");
		db.close();				
		Information.setTableName("jinlia_mirpur");
		Information.setAddress("Address: House# 2, Road# 4, Senpara Parbata ");
		Information.setContactNum("Call: 01950-015077");
		
		Intent intent = new Intent(Mirpur.this,Information.class);
		startActivity(intent);
	}
});
peoples.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("peoples_mirpur", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS peoples_mirpur");
		db.execSQL("CREATE TABLE IF NOT EXISTS peoples_mirpur ( Menu VARCHAR                ,       Price VARCHAR);");
		db.execSQL("INSERT INTO peoples_mirpur VALUES         ( 'Food Item                 ',       'Price')");
		db.execSQL("INSERT INTO peoples_mirpur VALUES         ( 'Vegetable Roll            ',       ' 30TK')");
		db.execSQL("INSERT INTO peoples_mirpur VALUES         ( 'Club Sandwich             ',       '115TK')");
		db.execSQL("INSERT INTO peoples_mirpur VALUES         ( 'Beef Burger               ',       ' 90TK')");
		db.execSQL("INSERT INTO peoples_mirpur VALUES         ( 'Vegetable Burger          ',       ' 65TK')");
		db.execSQL("INSERT INTO peoples_mirpur VALUES         ( 'Fried Chicken             ',       ' 80TK')");
		db.execSQL("INSERT INTO peoples_mirpur VALUES         ( 'Chicken Wings             ',       ' 40TK')");
		db.execSQL("INSERT INTO peoples_mirpur VALUES         ( 'Spring Roll               ',       '150TK')");
		db.execSQL("INSERT INTO peoples_mirpur VALUES         ( 'Chicken Ball(6 pcs)       ',       '150TK')");
		db.execSQL("INSERT INTO peoples_mirpur VALUES         ( 'Prawn Ball(5 pcs)         ',       '200TK')");
		db.execSQL("INSERT INTO peoples_mirpur VALUES         ( 'Chicken Corn Soup         ',       '100TK')");
		db.close();				
		Information.setTableName("peoples_mirpur");
		Information.setAddress("Address: Plot-8, Main Road-3, Section-7, Mirpur ");
		Information.setContactNum("Call: 01616 486479");
		
		Intent intent = new Intent(Mirpur.this,Information.class);
		startActivity(intent);
	}
});
sigree.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("sigree_mirpur", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS sigree_mirpur");
		db.execSQL("CREATE TABLE IF NOT EXISTS sigree_mirpur ( Menu VARCHAR                  ,       Price VARCHAR);");
		db.execSQL("INSERT INTO sigree_mirpur VALUES         ( 'Food Item                   ',       'Price')");
		db.execSQL("INSERT INTO sigree_mirpur VALUES         ( 'Pakhtuni Shorba             ',       '150TK')");
		db.execSQL("INSERT INTO sigree_mirpur VALUES         ( 'Ajwaini Murgh Shorba        ',       '175TK')");
		db.execSQL("INSERT INTO sigree_mirpur VALUES         ( 'Bhatti Ke Aloo              ',       '325TK')");
		db.execSQL("INSERT INTO sigree_mirpur VALUES         ( 'Dilliwali Tikki             ',       '350TK')");
		db.execSQL("INSERT INTO sigree_mirpur VALUES         ( 'Murgh Adraki Tangdi         ',       '465TK')");
		db.execSQL("INSERT INTO sigree_mirpur VALUES         ( 'Bhatti Murgh                ',       '465TK')");
		db.execSQL("INSERT INTO sigree_mirpur VALUES         ( 'Methi Mahi Tikka            ',       '575TK')");
		db.execSQL("INSERT INTO sigree_mirpur VALUES         ( 'Dal Sigree                  ',       '275TK')");
		db.execSQL("INSERT INTO sigree_mirpur VALUES         ( 'Kosha Gosht                 ',       '550TK')");
		db.execSQL("INSERT INTO sigree_mirpur VALUES         ( 'Kadhai Jhinga               ',       '725TK')");
		db.close();				
		Information.setTableName("sigree_mirpur");
		Information.setAddress("Address: House 1, Road 12, Block C, Mirpur Section 6 ");
		Information.setContactNum("Call: +8802-9009396");
		
		Intent intent = new Intent(Mirpur.this,Information.class);
		startActivity(intent);
	}
});
western.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("WESTERN_mirpur", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS WESTERN_mirpur");
		db.execSQL("CREATE TABLE IF NOT EXISTS WESTERN_mirpur ( Menu VARCHAR              ,       Price VARCHAR);");
		db.execSQL("INSERT INTO WESTERN_mirpur VALUES         ( 'Food Item               ',      'Price')");
		db.execSQL("INSERT INTO WESTERN_mirpur VALUES         ( 'Chicken 21              ',      '260TK')");
		db.execSQL("INSERT INTO WESTERN_mirpur VALUES         ( 'Spaghetti Meal          ',      '245TK')");
		db.execSQL("INSERT INTO WESTERN_mirpur VALUES         ( 'Chicken Delight         ',      '335TK')");
		db.execSQL("INSERT INTO WESTERN_mirpur VALUES         ( 'Crunchy Chicken Burger  ',      '235TK')");
		db.execSQL("INSERT INTO WESTERN_mirpur VALUES         ( 'Beef Burger             ',      '210TK')");
		db.execSQL("INSERT INTO WESTERN_mirpur VALUES         ( 'Pan Pizza Beef          ',      '340TK')");
		db.execSQL("INSERT INTO WESTERN_mirpur VALUES         ( 'Pan Pizza Chicken       ',      '340TK')");
		db.execSQL("INSERT INTO WESTERN_mirpur VALUES         ( 'Pan Pizza Vegetable     ',      '340TK')");
		db.execSQL("INSERT INTO WESTERN_mirpur VALUES         ( 'Chicken Supreme Burger  ',      '240TK')");
		db.execSQL("INSERT INTO WESTERN_mirpur VALUES         ( 'Ultimate Cheese Burger  ',      '295TK')");
		db.close();				
		Information.setTableName("WESTERN_mirpur");
		Information.setAddress("Address: 149/Ga/1, Shah Ali Bagh, Mirpur – 2 ");
		Information.setContactNum("Call:  8050228");
		
		Intent intent = new Intent(Mirpur.this,Information.class);
		startActivity(intent);
	}
});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mirpur, menu);
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
