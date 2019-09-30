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

public class Uttara extends Activity {
   
	Button fazitas,grabngo,georges,hungry,hot,italian,mack,backyard,tbc,turkish;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_uttara);
		fazitas=(Button)findViewById(R.id.Button_FAZITAS);
		grabngo=(Button)findViewById(R.id.Button_GRAB_N_GO);
		georges=(Button)findViewById(R.id.Button_GEORGES_CAFE);
		hungry=(Button)findViewById(R.id.Button_HUNGRY_DUCK);
		hot=(Button)findViewById(R.id.Button_HOT_BOX);
		italian=(Button)findViewById(R.id.Button_Button_ITALIAN_PIZZA_HOUSE);
		mack=(Button)findViewById(R.id.Button_MACK_N_JACK);
		backyard=(Button)findViewById(R.id.Button_THE_BACKYARD_CHEF);
		tbc=(Button)findViewById(R.id.Button_TBC_EXPRESS);
		turkish=(Button)findViewById(R.id.Button_TURKISH_KABABNPIZZA);
fazitas.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				SQLiteDatabase db = openOrCreateDatabase("fazitas_uttara", MODE_PRIVATE, null);
				db.execSQL("DROP TABLE IF EXISTS fazitas_uttara");
				db.execSQL("CREATE TABLE IF NOT EXISTS fazitas_uttara ( Menu VARCHAR                  ,       Price VARCHAR);");
				db.execSQL("INSERT INTO fazitas_uttara VALUES         ( 'Food Item                    ',       'Price')");
				db.execSQL("INSERT INTO fazitas_uttara VALUES         ( 'Fajitas                      ',       '140TK')");
				db.execSQL("INSERT INTO fazitas_uttara VALUES         ( 'Ranchi Chicken Taco          ',       '140TK')");
				db.execSQL("INSERT INTO fazitas_uttara VALUES         ( 'Gordita Chicken Taco         ',       '145TK')");
				db.execSQL("INSERT INTO fazitas_uttara VALUES         ( 'Nachos Supreme               ',       '170TK')");
				db.execSQL("INSERT INTO fazitas_uttara VALUES         ( 'Spicy Chicken Burrito        ',       '155TK')");
				db.execSQL("INSERT INTO fazitas_uttara VALUES         ( 'Quesadilla(Chicken)          ',       '155TK')");
				db.execSQL("INSERT INTO fazitas_uttara VALUES         ( 'Quesadilla(Beef)             ',       '165TK')");
				db.execSQL("INSERT INTO fazitas_uttara VALUES         ( 'Cheesy Fiesta Potatoes       ',       '100TK')");
				db.execSQL("INSERT INTO fazitas_uttara VALUES         ( 'Pambazo                      ',       '130TK')");
				db.execSQL("INSERT INTO fazitas_uttara VALUES         ( 'Mexican Bowl                 ',       '220TK')");
				db.close();				
				Information.setTableName("fazitas_uttara");
				Information.setAddress("Address:  Shwapno Food Court, Road-2, Sector#3,");
				Information.setContactNum("Call: 01911733167");
				
				Intent intent = new Intent(Uttara.this,Information.class);
				startActivity(intent);
			}
		});
grabngo.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("grabngo_uttara", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS grabngo_uttara");
		db.execSQL("CREATE TABLE IF NOT EXISTS grabngo_uttara ( Menu VARCHAR                    ,       Price VARCHAR);");
		db.execSQL("INSERT INTO grabngo_uttara VALUES         ( 'Food Item                     ',       'Price')");
		db.execSQL("INSERT INTO grabngo_uttara VALUES         ( 'Bar-B-Q Chicken Meal          ',       '300TK')");
		db.execSQL("INSERT INTO grabngo_uttara VALUES         ( 'Fried Chicken Meal            ',       '190TK')");
		db.execSQL("INSERT INTO grabngo_uttara VALUES         ( 'Chicken Stir Fry Meal         ',       '290TK')");
		db.execSQL("INSERT INTO grabngo_uttara VALUES         ( 'Student Meal                  ',       '200TK')");
		db.execSQL("INSERT INTO grabngo_uttara VALUES         ( 'Tower Burger                  ',       '325TK')");
		db.execSQL("INSERT INTO grabngo_uttara VALUES         ( 'Grill Chicken Burger          ',       '235TK')");
		db.execSQL("INSERT INTO grabngo_uttara VALUES         ( 'Grab & Go Special Burger      ',       '250TK')");
		db.execSQL("INSERT INTO grabngo_uttara VALUES         ( 'Pop Chicken 12 Pcs            ',       '200TK')");
		db.execSQL("INSERT INTO grabngo_uttara VALUES         ( 'Cheesy Chicken Roll           ',       '100TK')");
		db.execSQL("INSERT INTO grabngo_uttara VALUES         ( 'Chicken Egg Roll              ',       '125TK')");
		db.close();				
		Information.setTableName("grabngo_uttara");
		Information.setAddress("Address: House-49, Sonargaon Janapath, Sector-7, Uttara");
		Information.setContactNum("Call: 01733-070639");
		
		Intent intent = new Intent(Uttara.this,Information.class);
		startActivity(intent);
	}
});
georges.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("georges_uttara", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS georges_uttara");
		db.execSQL("CREATE TABLE IF NOT EXISTS georges_uttara ( Menu VARCHAR                ,       Price VARCHAR);");
		db.execSQL("INSERT INTO georges_uttara VALUES         ( 'Food Item                 ',       'Price')");
		db.execSQL("INSERT INTO georges_uttara VALUES         ( 'Chocolate Cupcake         ',       '100TK')");
		db.execSQL("INSERT INTO georges_uttara VALUES         ( 'Brownie                   ',       '120TK')");
		db.execSQL("INSERT INTO georges_uttara VALUES         ( 'Pretzels                  ',       ' 70TK')");
		db.execSQL("INSERT INTO georges_uttara VALUES         ( 'German Chicken            ',       '150TK')");
		db.execSQL("INSERT INTO georges_uttara VALUES         ( 'BBQ Chicken               ',       '165TK')");
		db.execSQL("INSERT INTO georges_uttara VALUES         ( 'Chinatown Dog             ',       '120TK')");
		db.execSQL("INSERT INTO georges_uttara VALUES         ( 'Astoria Dog               ',       '120TK')");
		db.execSQL("INSERT INTO georges_uttara VALUES         ( 'Wall Street Dog           ',       '120TK')");
		db.execSQL("INSERT INTO georges_uttara VALUES         ( 'Coney Island Dog          ',       '120TK')");
		db.execSQL("INSERT INTO georges_uttara VALUES         ( 'Hell’s Kitchen Dawg       ',       '120TK')");
		db.close();				
		Information.setTableName("georges_uttara");
		Information.setAddress("Address: House 2, 10 Road 10 ");
		Information.setContactNum("Call: 01784-436743");
		
		Intent intent = new Intent(Uttara.this,Information.class);
		startActivity(intent);
	}
});
hungry.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("hungry_uttara", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS hungry_uttara");
		db.execSQL("CREATE TABLE IF NOT EXISTS hungry_uttara ( Menu VARCHAR                ,       Price VARCHAR);");
		db.execSQL("INSERT INTO hungry_uttara VALUES         ( 'Food Item                 ',       'Price')");
		db.execSQL("INSERT INTO hungry_uttara VALUES         ( 'Caesar with Chicken       ',       '340TK')");
		db.execSQL("INSERT INTO hungry_uttara VALUES         ( 'Tropical Chicken Salad    ',       ' 85TK')");
		db.execSQL("INSERT INTO hungry_uttara VALUES         ( 'French Onion Soup         ',       '520TK')");
		db.execSQL("INSERT INTO hungry_uttara VALUES         ( 'Hot & Sour Soup           ',       '420TK')");
		db.execSQL("INSERT INTO hungry_uttara VALUES         ( 'Chicken Fried Rice        ',       '425TK')");
		db.execSQL("INSERT INTO hungry_uttara VALUES         ( 'Masala Chowmein           ',       '410TK')");
		db.execSQL("INSERT INTO hungry_uttara VALUES         ( 'Thai Fried Chicken        ',       '650TK')");
		db.execSQL("INSERT INTO hungry_uttara VALUES         ( 'Chicken Sizzling          ',       '475TK')");
		db.execSQL("INSERT INTO hungry_uttara VALUES         ( 'Chicken Butter Masala     ',       '400TK')");
		db.execSQL("INSERT INTO hungry_uttara VALUES         ( 'Chicken Reshmi Masala     ',       '550TK')");
		db.close();				
		Information.setTableName("hungry_uttara");
		Information.setAddress("Address: Plot 38, Road No 2, Uttara 3 ");
		Information.setContactNum("Call: 880-2-8958557");
		
		Intent intent = new Intent(Uttara.this,Information.class);
		startActivity(intent);
	}
});
hot.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("hot_uttara", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS hot_uttara");
		db.execSQL("CREATE TABLE IF NOT EXISTS hot_uttara ( Menu VARCHAR                ,       Price VARCHAR);");
		db.execSQL("INSERT INTO hot_uttara VALUES         ( 'Food Item                 ',       'Price')");
		db.execSQL("INSERT INTO hot_uttara VALUES         ( 'Thai Soup                 ',       '150TK')");
		db.execSQL("INSERT INTO hot_uttara VALUES         ( 'French Fries              ',       '100TK')");
		db.execSQL("INSERT INTO hot_uttara VALUES         ( 'Coleslaw                  ',       '100TK')");
		db.execSQL("INSERT INTO hot_uttara VALUES         ( 'Raita                     ',       ' 80TK')");
		db.execSQL("INSERT INTO hot_uttara VALUES         ( 'Plum Chatni               ',       '120TK')");
		db.execSQL("INSERT INTO hot_uttara VALUES         ( 'Chicken Chapli Kabab      ',       '390TK')");
		db.execSQL("INSERT INTO hot_uttara VALUES         ( 'Beef Khiri Kabab          ',       '350TK')");
		db.execSQL("INSERT INTO hot_uttara VALUES         ( 'Chicken Reshmi Kabab      ',       '350TK')");
		db.execSQL("INSERT INTO hot_uttara VALUES         ( 'Afghani Kabab             ',       '390TK')");
		db.execSQL("INSERT INTO hot_uttara VALUES         ( 'Chicken Steak             ',       '580TK')");
		db.close();				
		Information.setTableName("hot_uttara");
		Information.setAddress("Address:  Road# 11, House# 19, Sector# 1, Uttara ");
		Information.setContactNum("Call: 01716-736958");
		
		Intent intent = new Intent(Uttara.this,Information.class);
		startActivity(intent);
	}
});
italian.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("italian_uttara", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS italian_uttara");
		db.execSQL("CREATE TABLE IF NOT EXISTS italian_uttara ( Menu VARCHAR                ,       Price VARCHAR);");
		db.execSQL("INSERT INTO italian_uttara VALUES         ( 'Food Item                 ',       'Price')");
		db.execSQL("INSERT INTO italian_uttara VALUES         ( 'Mutton Nehari             ',       '350TK')");
		db.execSQL("INSERT INTO italian_uttara VALUES         ( 'Mutton Masala             ',       '400TK')");
		db.execSQL("INSERT INTO italian_uttara VALUES         ( 'Mutton Korma              ',       '400TK')");
		db.execSQL("INSERT INTO italian_uttara VALUES         ( 'Fish Karai                ',       '430TK')");
		db.execSQL("INSERT INTO italian_uttara VALUES         ( 'Fish Dopiaza              ',       '430TK')");
		db.execSQL("INSERT INTO italian_uttara VALUES         ( 'Fried Pomfret             ',       '450TK')");
		db.execSQL("INSERT INTO italian_uttara VALUES         ( 'Chicken Korma             ',       '350TK')");
		db.execSQL("INSERT INTO italian_uttara VALUES         ( 'Chicken Makhani           ',       '350TK')");
		db.execSQL("INSERT INTO italian_uttara VALUES         ( 'Beef Achari               ',       '290TK')");
		db.execSQL("INSERT INTO italian_uttara VALUES         ( 'Paneer Kulcha             ',       ' 80TK')");
		db.close();				
		Information.setTableName("italian_uttara");
		Information.setAddress("Address: House 23, Road 8, sector 4, Uttara ");
		Information.setContactNum("Call: 01950-015077");
		
		Intent intent = new Intent(Uttara.this,Information.class);
		startActivity(intent);
	}
});
mack.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("mack_uttara", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS mack_uttara");
		db.execSQL("CREATE TABLE IF NOT EXISTS mack_uttara ( Menu VARCHAR                ,       Price VARCHAR);");
		db.execSQL("INSERT INTO mack_uttara VALUES         ( 'Food Item                 ',       'Price')");
		db.execSQL("INSERT INTO mack_uttara VALUES         ( 'Thai Soup                 ',       '150TK')");
		db.execSQL("INSERT INTO mack_uttara VALUES         ( 'French Fries              ',       '100TK')");
		db.execSQL("INSERT INTO mack_uttara VALUES         ( 'Coleslaw                  ',       '100TK')");
		db.execSQL("INSERT INTO mack_uttara VALUES         ( 'Raita                     ',       ' 80TK')");
		db.execSQL("INSERT INTO mack_uttara VALUES         ( 'Plum Chatni               ',       '120TK')");
		db.execSQL("INSERT INTO mack_uttara VALUES         ( 'Chicken Chapli Kabab      ',       '390TK')");
		db.execSQL("INSERT INTO mack_uttara VALUES         ( 'Beef Khiri Kabab          ',       '350TK')");
		db.execSQL("INSERT INTO mack_uttara VALUES         ( 'Chicken Reshmi Kabab      ',       '350TK')");
		db.execSQL("INSERT INTO mack_uttara VALUES         ( 'Afghani Kabab             ',       '390TK')");
		db.execSQL("INSERT INTO mack_uttara VALUES         ( 'Chicken Steak             ',       '580TK')");
		db.close();				
		Information.setTableName("mack_uttara");
		Information.setAddress("Address:   House #4, Lake Drive Road ");
		Information.setContactNum("Call: 01937-575577");
		
		Intent intent = new Intent(Uttara.this,Information.class);
		startActivity(intent);
	}
});
backyard.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("backyard_uttara", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS backyard_uttara");
		db.execSQL("CREATE TABLE IF NOT EXISTS backyard_uttara ( Menu VARCHAR                  ,       Price VARCHAR);");
		db.execSQL("INSERT INTO backyard_uttara VALUES         ( 'Food Item                   ',       'Price')");
		db.execSQL("INSERT INTO backyard_uttara VALUES         ( 'Lollipop Chicken (3 pezzi)  ',       '150TK')");
		db.execSQL("INSERT INTO backyard_uttara VALUES         ( 'Lollipop Chicken (5 pezzi)  ',       '240TK')");
		db.execSQL("INSERT INTO backyard_uttara VALUES         ( 'Chicken Croquette (3 pezzi) ',       ' 99TK')");
		db.execSQL("INSERT INTO backyard_uttara VALUES         ( 'Chicken Croquette (7 pezzi) ',       '199TK')");
		db.execSQL("INSERT INTO backyard_uttara VALUES         ( 'Chicken BBQ Panini (Single) ',       '240TK')");
		db.execSQL("INSERT INTO backyard_uttara VALUES         ( 'Chicken BBQ Panini (Double) ',       '360TK')");
		db.execSQL("INSERT INTO backyard_uttara VALUES         ( 'Vegetable Panini (Single)   ',       '240TK')");
		db.execSQL("INSERT INTO backyard_uttara VALUES         ( 'Vegetable Panini (Double)   ',       '360TK')");
		db.execSQL("INSERT INTO backyard_uttara VALUES         ( 'Cheese Cake                 ',       '170TK')");
		db.execSQL("INSERT INTO backyard_uttara VALUES         ( 'Brownie                     ',       ' 80TK')");
		db.close();				
		Information.setTableName("backyard_uttara");
		Information.setAddress("Address: 13 Rabindra Sarani,Uttara ");
		Information.setContactNum("Call: 01841-111822");
		
		Intent intent = new Intent(Uttara.this,Information.class);
		startActivity(intent);
	}
});
tbc.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("tbc_uttara", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS tbc_uttara");
		db.execSQL("CREATE TABLE IF NOT EXISTS tbc_uttara ( Menu VARCHAR                 ,       Price VARCHAR);");
		db.execSQL("INSERT INTO tbc_uttara VALUES         ( 'Food Item                  ',       'Price')");
		db.execSQL("INSERT INTO tbc_uttara VALUES         ( 'Express Beef Burger        ',       '160TK')");
		db.execSQL("INSERT INTO tbc_uttara VALUES         ( 'Express Beef Cheese Burger ',       '190TK')");
		db.execSQL("INSERT INTO tbc_uttara VALUES         ( 'Express BBQ Chicken Burger ',       '180TK')");
		db.execSQL("INSERT INTO tbc_uttara VALUES         ( 'Club Sandwich              ',       '130TK')");
		db.execSQL("INSERT INTO tbc_uttara VALUES         ( 'BBQ Chicken Sandwich       ',       '150TK')");
		db.execSQL("INSERT INTO tbc_uttara VALUES         ( 'Crimson Chicken Rice       ',       '160TK')");
		db.execSQL("INSERT INTO tbc_uttara VALUES         ( 'BBQ Chicken Rice           ',       '170TK')");
		db.execSQL("INSERT INTO tbc_uttara VALUES         ( 'Cheese Cake                ',       '120TK')");
		db.execSQL("INSERT INTO tbc_uttara VALUES         ( 'Plain Cake                 ',       '150TK')");
		db.execSQL("INSERT INTO tbc_uttara VALUES         ( 'Nuts Cake                  ',       '220TK')");
		db.close();				
		Information.setTableName("tbc_uttara");
		Information.setAddress("Address: 10 Gareeb E Newaj Avenue, Sector 13 ");
		Information.setContactNum("Call: +8801833155926");
		
		Intent intent = new Intent(Uttara.this,Information.class);
		startActivity(intent);
	}
});
turkish.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("turkish_uttara", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS turkish_uttara");
		db.execSQL("CREATE TABLE IF NOT EXISTS turkish_uttara ( Menu VARCHAR                ,       Price VARCHAR);");
		db.execSQL("INSERT INTO turkish_uttara VALUES         ( 'Food Item                 ',       'Price')");
		db.execSQL("INSERT INTO turkish_uttara VALUES         ( 'Chicken Shish             ',       '480TK')");
		db.execSQL("INSERT INTO turkish_uttara VALUES         ( 'Adana Kabab               ',       '435TK')");
		db.execSQL("INSERT INTO turkish_uttara VALUES         ( 'Meatball                  ',       '520TK')");
		db.execSQL("INSERT INTO turkish_uttara VALUES         ( 'Shawarma Chicken Burger   ',       '200TK')");
		db.execSQL("INSERT INTO turkish_uttara VALUES         ( 'Dal Soup                  ',       '130TK')");
		db.execSQL("INSERT INTO turkish_uttara VALUES         ( 'Pitta Bread               ',       ' 52TK')");
		db.execSQL("INSERT INTO turkish_uttara VALUES         ( 'Lahmacun                  ',       '152TK')");
		db.execSQL("INSERT INTO turkish_uttara VALUES         ( 'Pizza With Chicken        ',       '290TK')");
		db.execSQL("INSERT INTO turkish_uttara VALUES         ( 'Pizza With Vegetable      ',       '400TK')");
		db.execSQL("INSERT INTO turkish_uttara VALUES         ( 'Turkish Special Pizza     ',       '520TK')");
		db.close();				
		Information.setTableName("turkish_uttara");
		Information.setAddress("Address:  House# 21, Road# 7, Sector# 4, Uttara ");
		Information.setContactNum("Call: 01765551451");
		
		Intent intent = new Intent(Uttara.this,Information.class);
		startActivity(intent);
	}
});


		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.uttara, menu);
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
