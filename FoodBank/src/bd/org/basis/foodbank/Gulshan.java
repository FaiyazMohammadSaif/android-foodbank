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

public class Gulshan extends Activity {
    
	Button bbq,burger,bittersweet,barbecue,gloria,handi,khazana,pizzain,kenny,saltz,topkapi,village;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gulshan);
		bbq=(Button)findViewById(R.id.Button_BBQ);
		burger=(Button)findViewById(R.id.Button_BURGER_WORLD);
		bittersweet=(Button)findViewById(R.id.Button_BITTER_SWEET_CAFE);
		barbecue=(Button)findViewById(R.id.Button_BARBECUE_FLAMES);
		gloria=(Button)findViewById(R.id.Button_GLORIA);
		handi=(Button)findViewById(R.id.Button_HANDI);
		khazana=(Button)findViewById(R.id.Button_KHAZANA);
		pizzain=(Button)findViewById(R.id.Button_PIZZA_INN);
		kenny=(Button)findViewById(R.id.Button_KENNY_ROGERS_ROASTERS);
		saltz=(Button)findViewById(R.id.Button_SALTZ);
		topkapi=(Button)findViewById(R.id.Button_TOPKAPI);
		village=(Button)findViewById(R.id.Button_VILLAGE);
bbq.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				SQLiteDatabase db = openOrCreateDatabase("bbq_Gulshan", MODE_PRIVATE, null);
				db.execSQL("DROP TABLE IF EXISTS bbq_Gulshan");
				db.execSQL("CREATE TABLE IF NOT EXISTS bbq_Gulshan ( Menu VARCHAR                  ,       Price VARCHAR);");
				db.execSQL("INSERT INTO bbq_Gulshan VALUES         ( 'Food Item                    ',       'Price')");
				db.execSQL("INSERT INTO bbq_Gulshan VALUES         ( 'Golden Olive Chicken(2p)     ',       '350TK')");
				db.execSQL("INSERT INTO bbq_Gulshan VALUES         ( 'Golden Olive Chicken(4p)     ',       '650TK')");
				db.execSQL("INSERT INTO bbq_Gulshan VALUES         ( 'Hot Spicy Chicken(10p)       ',       '695TK')");
				db.execSQL("INSERT INTO bbq_Gulshan VALUES         ( 'Paris Wings(10p)             ',       '680TK')");
				db.execSQL("INSERT INTO bbq_Gulshan VALUES         ( 'Vegetable Fried Rice         ',       '210TK')");
				db.execSQL("INSERT INTO bbq_Gulshan VALUES         ( 'Steamed Rice                 ',       ' 45TK')");
				db.execSQL("INSERT INTO bbq_Gulshan VALUES         ( 'Jamaican Grilled Whole Leg   ',       '695TK')");
				db.execSQL("INSERT INTO bbq_Gulshan VALUES         ( 'Korean Charbroiled(Thigh 3)  ',       '650TK')");
				db.execSQL("INSERT INTO bbq_Gulshan VALUES         ( 'Original Barbecue(Whole Leg) ',       '665TK')");
				db.execSQL("INSERT INTO bbq_Gulshan VALUES         ( 'Kids Meal                    ',       '280TK')");
				db.close();				
				Information.setTableName("bbq_Gulshan");
				Information.setAddress("Address: House 175/A, 1st & 2nd floor, Road No 61");
				Information.setContactNum("Call: 01776-117788");
				
				Intent intent = new Intent(Gulshan.this,Information.class);
				startActivity(intent);
			}
		});
burger.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("burgerworld_Gulshan", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS burgerworld_Gulshan");
		db.execSQL("CREATE TABLE IF NOT EXISTS burgerworld_Gulshan ( Menu VARCHAR                    ,       Price VARCHAR);");
		db.execSQL("INSERT INTO burgerworld_Gulshan VALUES         ( 'Food Item                     ',       'Price')");
		db.execSQL("INSERT INTO burgerworld_Gulshan VALUES         ( 'Pizza Burger                  ',       '600TK')");
		db.execSQL("INSERT INTO burgerworld_Gulshan VALUES         ( 'Mega Big Jack Burger          ',       '400TK')");
		db.execSQL("INSERT INTO burgerworld_Gulshan VALUES         ( 'Double Jack Burger            ',       '345TK')");
		db.execSQL("INSERT INTO burgerworld_Gulshan VALUES         ( 'Big Jack Burger               ',       '300TK')");
		db.execSQL("INSERT INTO burgerworld_Gulshan VALUES         ( 'Quarter Pounder               ',       '195TK')");
		db.execSQL("INSERT INTO burgerworld_Gulshan VALUES         ( 'Grill Chicken Burger          ',       '170TK')");
		db.execSQL("INSERT INTO burgerworld_Gulshan VALUES         ( 'Grill Chicken Cheese Burger   ',       '195TK')");
		db.execSQL("INSERT INTO burgerworld_Gulshan VALUES         ( 'Classic Chicken Cheese Burger ',       '180TK')");
		db.execSQL("INSERT INTO burgerworld_Gulshan VALUES         ( 'Fish Burger                   ',       '170TK')");
		db.execSQL("INSERT INTO burgerworld_Gulshan VALUES         ( 'Veggie Burger                 ',       '150TK')");
		db.close();				
		Information.setTableName("burgerworld_Gulshan");
		Information.setAddress("Address: 56 Gulshan Avenue,Road#132");
		Information.setContactNum("Call: 01913989909");
		
		Intent intent = new Intent(Gulshan.this,Information.class);
		startActivity(intent);
	}
});
bittersweet.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("bittersweet_Gulshan", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS bittersweet_Gulshan");
		db.execSQL("CREATE TABLE IF NOT EXISTS bittersweet_Gulshan ( Menu VARCHAR                ,       Price VARCHAR);");
		db.execSQL("INSERT INTO bittersweet_Gulshan VALUES         ( 'Food Item                 ',       'Price')");
		db.execSQL("INSERT INTO bittersweet_Gulshan VALUES         ( 'Lasagne                   ',       '420TK')");
		db.execSQL("INSERT INTO bittersweet_Gulshan VALUES         ( 'French Fries              ',       '250TK')");
		db.execSQL("INSERT INTO bittersweet_Gulshan VALUES         ( 'Pasta Salad               ',       '300TK')");
		db.execSQL("INSERT INTO bittersweet_Gulshan VALUES         ( 'Chocolate Éclair          ',       '250TK')");
		db.execSQL("INSERT INTO bittersweet_Gulshan VALUES         ( 'Cheese Cake               ',       '390TK')");
		db.execSQL("INSERT INTO bittersweet_Gulshan VALUES         ( 'Apple Pie                 ',       '250TK')");
		db.execSQL("INSERT INTO bittersweet_Gulshan VALUES         ( 'Chocolate Tart            ',       '280TK')");
		db.execSQL("INSERT INTO bittersweet_Gulshan VALUES         ( 'Coke                      ',       ' 85TK')");
		db.execSQL("INSERT INTO bittersweet_Gulshan VALUES         ( 'Fresh Lime Soda           ',       '170TK')");
		db.execSQL("INSERT INTO bittersweet_Gulshan VALUES         ( 'Mineral Water             ',       ' 40TK')");
		db.close();				
		Information.setTableName("bittersweet_Gulshan");
		Information.setAddress("Address: House 10, Road 53,Gulshan 2 ");
		Information.setContactNum("Call: 0191-977-4559");
		
		Intent intent = new Intent(Gulshan.this,Information.class);
		startActivity(intent);
	}
});
gloria.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("gloria_Gulshan", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS gloria_Gulshan");
		db.execSQL("CREATE TABLE IF NOT EXISTS gloria_Gulshan ( Menu VARCHAR                ,       Price VARCHAR);");
		db.execSQL("INSERT INTO gloria_Gulshan VALUES         ( 'Food Item                 ',       'Price')");
		db.execSQL("INSERT INTO gloria_Gulshan VALUES         ( 'Pancake                   ',       '200TK')");
		db.execSQL("INSERT INTO gloria_Gulshan VALUES         ( 'Garlic Mushroom           ',       '220TK')");
		db.execSQL("INSERT INTO gloria_Gulshan VALUES         ( 'Lemon Chicken Salad       ',       '440TK')");
		db.execSQL("INSERT INTO gloria_Gulshan VALUES         ( 'Tuna Sandwich             ',       '330TK')");
		db.execSQL("INSERT INTO gloria_Gulshan VALUES         ( 'Beef Lasanga              ',       '730TK')");
		db.execSQL("INSERT INTO gloria_Gulshan VALUES         ( 'French Fries              ',       '150TK')");
		db.execSQL("INSERT INTO gloria_Gulshan VALUES         ( 'Hot Chocolate             ',       '240TK')");
		db.execSQL("INSERT INTO gloria_Gulshan VALUES         ( 'Tea                       ',       '145TK')");
		db.execSQL("INSERT INTO gloria_Gulshan VALUES         ( 'Espresso Shot             ',       ' 90TK')");
		db.execSQL("INSERT INTO gloria_Gulshan VALUES         ( 'Flavour Syrup             ',       ' 80TK')");
		db.close();				
		Information.setTableName("gloria_Gulshan");
		Information.setAddress("Address: House # 35, Gulshan Avenue ");
		Information.setContactNum("Call: +8802-9894045");
		
		Intent intent = new Intent(Gulshan.this,Information.class);
		startActivity(intent);
	}
});
barbecue.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("barbecue_Gulshan", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS barbecue_Gulshan");
		db.execSQL("CREATE TABLE IF NOT EXISTS barbecue_Gulshan ( Menu VARCHAR                ,       Price VARCHAR);");
		db.execSQL("INSERT INTO barbecue_Gulshan VALUES         ( 'Food Item                 ',       'Price')");
		db.execSQL("INSERT INTO barbecue_Gulshan VALUES         ( 'Thai Soup                 ',       '150TK')");
		db.execSQL("INSERT INTO barbecue_Gulshan VALUES         ( 'French Fries              ',       '100TK')");
		db.execSQL("INSERT INTO barbecue_Gulshan VALUES         ( 'Coleslaw                  ',       '100TK')");
		db.execSQL("INSERT INTO barbecue_Gulshan VALUES         ( 'Raita                     ',       ' 80TK')");
		db.execSQL("INSERT INTO barbecue_Gulshan VALUES         ( 'Plum Chatni               ',       '120TK')");
		db.execSQL("INSERT INTO barbecue_Gulshan VALUES         ( 'Chicken Chapli Kabab      ',       '390TK')");
		db.execSQL("INSERT INTO barbecue_Gulshan VALUES         ( 'Beef Khiri Kabab          ',       '350TK')");
		db.execSQL("INSERT INTO barbecue_Gulshan VALUES         ( 'Chicken Reshmi Kabab      ',       '350TK')");
		db.execSQL("INSERT INTO barbecue_Gulshan VALUES         ( 'Afghani Kabab             ',       '390TK')");
		db.execSQL("INSERT INTO barbecue_Gulshan VALUES         ( 'Chicken Steak             ',       '580TK')");
		db.close();				
		Information.setTableName("barbecue_Gulshan");
		Information.setAddress("Address: Plot# 5A, Gulshan Avenue, Gulshan-1 ");
		Information.setContactNum("Call: 02-8822293");
		
		Intent intent = new Intent(Gulshan.this,Information.class);
		startActivity(intent);
	}
});
handi.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("handi_Gulshan", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS handi_Gulshan");
		db.execSQL("CREATE TABLE IF NOT EXISTS handi_Gulshan ( Menu VARCHAR                ,       Price VARCHAR);");
		db.execSQL("INSERT INTO handi_Gulshan VALUES         ( 'Food Item                 ',       'Price')");
		db.execSQL("INSERT INTO handi_Gulshan VALUES         ( 'Mutton Nehari             ',       '350TK')");
		db.execSQL("INSERT INTO handi_Gulshan VALUES         ( 'Mutton Masala             ',       '400TK')");
		db.execSQL("INSERT INTO handi_Gulshan VALUES         ( 'Mutton Korma              ',       '400TK')");
		db.execSQL("INSERT INTO handi_Gulshan VALUES         ( 'Fish Karai                ',       '430TK')");
		db.execSQL("INSERT INTO handi_Gulshan VALUES         ( 'Fish Dopiaza              ',       '430TK')");
		db.execSQL("INSERT INTO handi_Gulshan VALUES         ( 'Fried Pomfret             ',       '450TK')");
		db.execSQL("INSERT INTO handi_Gulshan VALUES         ( 'Chicken Korma             ',       '350TK')");
		db.execSQL("INSERT INTO handi_Gulshan VALUES         ( 'Chicken Makhani           ',       '350TK')");
		db.execSQL("INSERT INTO handi_Gulshan VALUES         ( 'Beef Achari               ',       '290TK')");
		db.execSQL("INSERT INTO handi_Gulshan VALUES         ( 'Paneer Kulcha             ',       ' 80TK')");
		db.close();				
		Information.setTableName("handi_Gulshan");
		Information.setAddress("Address: House 24, Road 2, Gulshan 1 ");
		Information.setContactNum("Call: 01950-015077");
		
		Intent intent = new Intent(Gulshan.this,Information.class);
		startActivity(intent);
	}
});
khazana.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("khazana_Gulshan", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS khazana_Gulshan");
		db.execSQL("CREATE TABLE IF NOT EXISTS khazana_Gulshan ( Menu VARCHAR                ,       Price VARCHAR);");
		db.execSQL("INSERT INTO khazana_Gulshan VALUES         ( 'Food Item                 ',       'Price')");
		db.execSQL("INSERT INTO khazana_Gulshan VALUES         ( 'Thai Soup                 ',       '150TK')");
		db.execSQL("INSERT INTO khazana_Gulshan VALUES         ( 'French Fries              ',       '100TK')");
		db.execSQL("INSERT INTO khazana_Gulshan VALUES         ( 'Coleslaw                  ',       '100TK')");
		db.execSQL("INSERT INTO khazana_Gulshan VALUES         ( 'Raita                     ',       ' 80TK')");
		db.execSQL("INSERT INTO khazana_Gulshan VALUES         ( 'Plum Chatni               ',       '120TK')");
		db.execSQL("INSERT INTO khazana_Gulshan VALUES         ( 'Chicken Chapli Kabab      ',       '390TK')");
		db.execSQL("INSERT INTO khazana_Gulshan VALUES         ( 'Beef Khiri Kabab          ',       '350TK')");
		db.execSQL("INSERT INTO khazana_Gulshan VALUES         ( 'Chicken Reshmi Kabab      ',       '350TK')");
		db.execSQL("INSERT INTO khazana_Gulshan VALUES         ( 'Afghani Kabab             ',       '390TK')");
		db.execSQL("INSERT INTO khazana_Gulshan VALUES         ( 'Chicken Steak             ',       '580TK')");
		db.close();				
		Information.setTableName("khazana_Gulshan");
		Information.setAddress("Address:  House# 02,,Road# 21,Gulshan-1 ");
		Information.setContactNum("Call: 02-8826127");
		
		Intent intent = new Intent(Gulshan.this,Information.class);
		startActivity(intent);
	}
});
pizzain.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("pizzain_Gulshan", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS pizzain_Gulshan");
		db.execSQL("CREATE TABLE IF NOT EXISTS pizzain_Gulshan ( Menu VARCHAR                ,       Price VARCHAR);");
		db.execSQL("INSERT INTO pizzain_Gulshan VALUES         ( 'Food Item                 ',       'Price')");
		db.execSQL("INSERT INTO pizzain_Gulshan VALUES         ( 'Hawaiian Pizza            ',       '349TK')");
		db.execSQL("INSERT INTO pizzain_Gulshan VALUES         ( 'Chicken Tandoori Pizza    ',       '349TK')");
		db.execSQL("INSERT INTO pizzain_Gulshan VALUES         ( 'Grilled Chicken Pizza     ',       '349TK')");
		db.execSQL("INSERT INTO pizzain_Gulshan VALUES         ( 'BBQ Chicken Classic       ',       '349TK')");
		db.execSQL("INSERT INTO pizzain_Gulshan VALUES         ( 'Zesty Hot                 ',       '349TK')");
		db.execSQL("INSERT INTO pizzain_Gulshan VALUES         ( 'Meaty Max                 ',       '349TK')");
		db.execSQL("INSERT INTO pizzain_Gulshan VALUES         ( 'Penne Alla Forno          ',       '475TK')");
		db.execSQL("INSERT INTO pizzain_Gulshan VALUES         ( 'Carbonara                 ',       '355TK')");
		db.execSQL("INSERT INTO pizzain_Gulshan VALUES         ( 'Lasagna                   ',       '549TK')");
		db.execSQL("INSERT INTO pizzain_Gulshan VALUES         ( 'French Fries              ',       '155TK')");
		db.close();				
		Information.setTableName("pizzain_Gulshan");
		Information.setAddress("Address: House# 74, Road# 127, Gulshan Avenue ");
		Information.setContactNum("Call: 01839666663");
		
		Intent intent = new Intent(Gulshan.this,Information.class);
		startActivity(intent);
	}
});
kenny.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("kenny_Gulshan", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS kenny_Gulshan");
		db.execSQL("CREATE TABLE IF NOT EXISTS kenny_Gulshan ( Menu VARCHAR                ,       Price VARCHAR);");
		db.execSQL("INSERT INTO kenny_Gulshan VALUES         ( 'Food Item                 ',       'Price')");
		db.execSQL("INSERT INTO kenny_Gulshan VALUES         ( 'Chicken Meatballs Soup    ',       '150TK')");
		db.execSQL("INSERT INTO kenny_Gulshan VALUES         ( 'Tropical Island Soup      ',       '180TK')");
		db.execSQL("INSERT INTO kenny_Gulshan VALUES         ( 'Round-up Platter          ',       '250TK')");
		db.execSQL("INSERT INTO kenny_Gulshan VALUES         ( 'Chicken Caesar Salad      ',       '450TK')");
		db.execSQL("INSERT INTO kenny_Gulshan VALUES         ( 'Rollie's Bowl             ',       '350TK')");
		db.execSQL("INSERT INTO kenny_Gulshan VALUES         ( 'Kenny's Quarter Meal      ',       '650TK')");
		db.execSQL("INSERT INTO kenny_Gulshan VALUES         ( 'Country Chic Steak        ',       '596TK')");
		db.execSQL("INSERT INTO kenny_Gulshan VALUES         ( 'Potato Salad              ',       '190TK')");
		db.execSQL("INSERT INTO kenny_Gulshan VALUES         ( 'Aromatic Rice             ',       '190TK')");
		db.execSQL("INSERT INTO kenny_Gulshan VALUES         ( 'Cheese Cake               ',       '350TK')");
		db.close();				
		Information.setTableName("kenny_Gulshan");
		Information.setAddress("Address: 76, Bir Uttam Mir Shawkat Sarak, Gulshan Avenue ");
		Information.setContactNum("Call: 02-8822293");
		
		Intent intent = new Intent(Gulshan.this,Information.class);
		startActivity(intent);
	}
});
saltz.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("saltz_Gulshan", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS saltz_Gulshan");
		db.execSQL("CREATE TABLE IF NOT EXISTS saltz_Gulshan ( Menu VARCHAR                ,       Price VARCHAR);");
		db.execSQL("INSERT INTO saltz_Gulshan VALUES         ( 'Food Item                 ',       'Price')");
		db.execSQL("INSERT INTO saltz_Gulshan VALUES         ( 'Seafood Chowder           ',       '340TK')");
		db.execSQL("INSERT INTO saltz_Gulshan VALUES         ( 'Kakavia                   ',       '320TK')");
		db.execSQL("INSERT INTO saltz_Gulshan VALUES         ( 'Shrimp Cocktail           ',       '390TK')");
		db.execSQL("INSERT INTO saltz_Gulshan VALUES         ( 'Rosti Stack               ',       '560TK')");
		db.execSQL("INSERT INTO saltz_Gulshan VALUES         ( 'Tossed Salad              ',       '190TK')");
		db.execSQL("INSERT INTO saltz_Gulshan VALUES         ( 'Sauteed Vegetables        ',       '560TK')");
		db.execSQL("INSERT INTO saltz_Gulshan VALUES         ( 'Grilled Crab              ',       '330TK')");
		db.execSQL("INSERT INTO saltz_Gulshan VALUES         ( 'Grilled Fish Ball         ',       '630TK')");
		db.execSQL("INSERT INTO saltz_Gulshan VALUES         ( 'Tuna Club                 ',       '490TK')");
		db.execSQL("INSERT INTO saltz_Gulshan VALUES         ( 'Fudge Brownie             ',       '190TK')");
		db.close();				
		Information.setTableName("saltz_Gulshan");
		Information.setAddress("Address: NWF 8 Gulshan North Avenue ");
		Information.setContactNum("Call: 02-8818351");
		
		Intent intent = new Intent(Gulshan.this,Information.class);
		startActivity(intent);
	}
});
topkapi.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("topkapi_Gulshan", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS topkapi_Gulshan");
		db.execSQL("CREATE TABLE IF NOT EXISTS topkapi_Gulshan ( Menu VARCHAR                ,       Price VARCHAR);");
		db.execSQL("INSERT INTO topkapi_Gulshan VALUES         ( 'Food Item                 ',       'Price')");
		db.execSQL("INSERT INTO topkapi_Gulshan VALUES         ( 'Chicken Lolipop           ',       '450TK')");
		db.execSQL("INSERT INTO topkapi_Gulshan VALUES         ( 'Chicken Salad             ',       '540TK')");
		db.execSQL("INSERT INTO topkapi_Gulshan VALUES         ( 'Fried Prawn               ',       '600TK')");
		db.execSQL("INSERT INTO topkapi_Gulshan VALUES         ( 'Tomato Soup               ',       '430TK')");
		db.execSQL("INSERT INTO topkapi_Gulshan VALUES         ( 'Won Thun                  ',       '360TK')");
		db.execSQL("INSERT INTO topkapi_Gulshan VALUES         ( 'Mixed Salad               ',       '300TK')");
		db.execSQL("INSERT INTO topkapi_Gulshan VALUES         ( 'Beef Salad                ',       '600TK')");
		db.execSQL("INSERT INTO topkapi_Gulshan VALUES         ( 'Beef Rezala               ',       '525TK')");
		db.execSQL("INSERT INTO topkapi_Gulshan VALUES         ( 'Tomato Gosht              ',       '525TK')");
		db.execSQL("INSERT INTO topkapi_Gulshan VALUES         ( 'Aloo Keema                ',       '700TK')");
		db.close();				
		Information.setTableName("topkapi_Gulshan");
		Information.setAddress("Address: 134 Gulshan Avenue ");
		Information.setContactNum("Call: 02-8822293");
		
		Intent intent = new Intent(Gulshan.this,Information.class);
		startActivity(intent);
	}
});
village.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("village_Gulshan", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS village_Gulshan");
		db.execSQL("CREATE TABLE IF NOT EXISTS village_Gulshan ( Menu VARCHAR                ,       Price VARCHAR);");
		db.execSQL("INSERT INTO village_Gulshan VALUES         ( 'Food Item                 ',       'Price')");
		db.execSQL("INSERT INTO village_Gulshan VALUES         ( 'Dhaka Chicken             ',       '250TK')");
		db.execSQL("INSERT INTO village_Gulshan VALUES         ( 'Vegetable Pakora          ',       '199TK')");
		db.execSQL("INSERT INTO village_Gulshan VALUES         ( 'Village Platter           ',       '775TK')");
		db.execSQL("INSERT INTO village_Gulshan VALUES         ( 'French Fries              ',       ' 85TK')");
		db.execSQL("INSERT INTO village_Gulshan VALUES         ( 'Mexican Steak             ',       '870TK')");
		db.execSQL("INSERT INTO village_Gulshan VALUES         ( 'Fajitas Steak             ',       '820TK')");
		db.execSQL("INSERT INTO village_Gulshan VALUES         ( 'Brain Masala              ',       '575TK')");
		db.execSQL("INSERT INTO village_Gulshan VALUES         ( 'Methi Chaman              ',       '300TK')");
		db.execSQL("INSERT INTO village_Gulshan VALUES         ( 'Mixed Vegetable           ',       '280TK')");
		db.execSQL("INSERT INTO village_Gulshan VALUES         ( 'Pineapple Slice           ',       ' 35TK')");
		db.close();				
		Information.setTableName("village_Gulshan");
		Information.setAddress("Address: 33 Gulshan Avenue ");
		Information.setContactNum("Call: 02-8834707");
		
		Intent intent = new Intent(Gulshan.this,Information.class);
		startActivity(intent);
	}
});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.gulshan, menu);
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
