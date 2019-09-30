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

public class Dhanmondi extends Activity {
     
	Button arabian,ajo,american,bread,baburchi,mango,dhaba,dominus,korai,labamba,rizbiz,nandoos,western;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dhanmondi);
		arabian=(Button)findViewById(R.id.Button_ARABIAN_FAST_FOOD);
		ajo=(Button)findViewById(R.id.Button_AJO);
		american=(Button)findViewById(R.id.Button_AMERICAN_BURGER);
		bread=(Button)findViewById(R.id.Button_BREAD_AND_BEYOND);
		baburchi=(Button)findViewById(R.id.Button_BABURCHI_RESTURANT);
		mango=(Button)findViewById(R.id.Button_CAFE_MANGO);
		dhaba=(Button)findViewById(R.id.Button_DHABA);
		dominus=(Button)findViewById(R.id.Button_DOMINOUS_PIZZA);
		korai=(Button)findViewById(R.id.Button_KORAI_GOST);
		labamba=(Button)findViewById(R.id.Button_LABAMBA);
		rizbiz=(Button)findViewById(R.id.Button_RIZBIZ_CAFE);
		nandoos=(Button)findViewById(R.id.Button_NANDOS_DHANMONDI);
		western=(Button)findViewById(R.id.Button_WESTERN_GRILL_DHANMONDI);
arabian.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				SQLiteDatabase db = openOrCreateDatabase("Arabian_Dhanmondi", MODE_PRIVATE, null);
				db.execSQL("DROP TABLE IF EXISTS Arabian_Dhanmondi");
				db.execSQL("CREATE TABLE IF NOT EXISTS Arabian_Dhanmondi ( Menu VARCHAR          ,       Price VARCHAR);");
				db.execSQL("INSERT INTO Arabian_Dhanmondi VALUES         ( 'Food Item            ',      'Price')");
				db.execSQL("INSERT INTO Arabian_Dhanmondi VALUES         ( 'Pizza(6 inch)        ',      '250TK')");
				db.execSQL("INSERT INTO Arabian_Dhanmondi VALUES         ( 'Pizza(9 inch)        ',      '300TK')");
				db.execSQL("INSERT INTO Arabian_Dhanmondi VALUES         ( 'Pizza(12 inch)       ',      '340TK')");
				db.execSQL("INSERT INTO Arabian_Dhanmondi VALUES         ( 'Chicken Fry          ',      '140TK')");
				db.execSQL("INSERT INTO Arabian_Dhanmondi VALUES         ( 'Danish Chicken       ',      '150TK')");
				db.execSQL("INSERT INTO Arabian_Dhanmondi VALUES         ( 'Chicken Shawarma     ',      '125TK')");
				db.execSQL("INSERT INTO Arabian_Dhanmondi VALUES         ( 'Beef Shawarma        ',      '100TK')");
				db.execSQL("INSERT INTO Arabian_Dhanmondi VALUES         ( 'Sausage N Roll       ',      '130TK')");
				db.execSQL("INSERT INTO Arabian_Dhanmondi VALUES         ( 'Tuna Salad Sandwich  ',      '220TK')");
				db.execSQL("INSERT INTO Arabian_Dhanmondi VALUES         ( 'French Fry           ',      ' 70TK')");
				db.close();				
				Information.setTableName("Arabian_Dhanmondi");
				Information.setAddress("Address: Mirpur Road, Dhanmondi 4");
				Information.setContactNum("Call: +8801711854970");
				
				Intent intent = new Intent(Dhanmondi.this,Information.class);
				startActivity(intent);
			}
		});
ajo.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("AJO_Dhanmondi", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS AJO_Dhanmondi");
		db.execSQL("CREATE TABLE IF NOT EXISTS AJO_Dhanmondi ( Menu VARCHAR            ,       Price VARCHAR);");
		db.execSQL("INSERT INTO AJO_Dhanmondi VALUES         ( 'Food Item              ',      'Price')");
		db.execSQL("INSERT INTO AJO_Dhanmondi VALUES         ( 'Chicken Roll           ',      '249TK')");
		db.execSQL("INSERT INTO AJO_Dhanmondi VALUES         ( 'Beef Roll              ',      '249TK')");
		db.execSQL("INSERT INTO AJO_Dhanmondi VALUES         ( 'Greek Salad            ',      '293TK')");
		db.execSQL("INSERT INTO AJO_Dhanmondi VALUES         ( 'Pasta White Sauce      ',      '259TK')");
		db.execSQL("INSERT INTO AJO_Dhanmondi VALUES         ( 'Pasta Meat Sauce       ',      '259TK')");
		db.execSQL("INSERT INTO AJO_Dhanmondi VALUES         ( 'Spaghetti White Sauce  ',      '259TK')");
		db.execSQL("INSERT INTO AJO_Dhanmondi VALUES         ( 'Spaghetti Meat Sauce   ',      '259TK')");
		db.execSQL("INSERT INTO AJO_Dhanmondi VALUES         ( 'Penne Valladares       ',      '323TK')");
		db.execSQL("INSERT INTO AJO_Dhanmondi VALUES         ( 'Shrimp Pasta           ',      '289TK')");
		db.execSQL("INSERT INTO AJO_Dhanmondi VALUES         ( 'Pasta with Fish Balls  ',      '289TK')");
		db.close();				
		Information.setTableName("AJO_Dhanmondi");
		Information.setAddress("Address:  House- 60, Road-7A, Dhanmondi R/A");
		Information.setContactNum("Call: +8801819421777");
		
		Intent intent = new Intent(Dhanmondi.this,Information.class);
		startActivity(intent);
	}
});
american.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("AMERICAN_Dhanmondi", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS AMERICAN_Dhanmondi");
		db.execSQL("CREATE TABLE IF NOT EXISTS AMERICAN_Dhanmondi ( Menu VARCHAR           ,       Price VARCHAR);");
		db.execSQL("INSERT INTO AMERICAN_Dhanmondi VALUES         ( 'Food Item             ',      'Price')");
		db.execSQL("INSERT INTO AMERICAN_Dhanmondi VALUES         ( 'Beef Burger           ',      '130TK')");
		db.execSQL("INSERT INTO AMERICAN_Dhanmondi VALUES         ( 'Beef Cheese Burger    ',      '175TK')");
		db.execSQL("INSERT INTO AMERICAN_Dhanmondi VALUES         ( 'Double Beef Burger    ',      '250TK')");
		db.execSQL("INSERT INTO AMERICAN_Dhanmondi VALUES         ( 'Chicken Burger        ',      '150TK')");
		db.execSQL("INSERT INTO AMERICAN_Dhanmondi VALUES         ( 'Chicken Cheese Burger ',      '185TK')");
		db.execSQL("INSERT INTO AMERICAN_Dhanmondi VALUES         ( 'Double Chicken Burger ',      '260TK')");
		db.execSQL("INSERT INTO AMERICAN_Dhanmondi VALUES         ( 'Fish Burger           ',      '150TK')");
		db.execSQL("INSERT INTO AMERICAN_Dhanmondi VALUES         ( 'Fish Cheese Burger    ',      '185TK')");
		db.execSQL("INSERT INTO AMERICAN_Dhanmondi VALUES         ( 'Double Fish Burger    ',      '260TK')");
		db.execSQL("INSERT INTO AMERICAN_Dhanmondi VALUES         ( 'Egg Sandwich          ',      '100TK')");
		db.close();				
		Information.setTableName("AMERICAN_Dhanmondi");
		Information.setAddress("Address: House-53/1, Road-4/A, Shatmoshjid Road");
		Information.setContactNum("Call: +8801819444564");
		
		Intent intent = new Intent(Dhanmondi.this,Information.class);
		startActivity(intent);
	}
});
bread.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("bread_Dhanmondi", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS bread_Dhanmondi");
		db.execSQL("CREATE TABLE IF NOT EXISTS bread_Dhanmondi ( Menu VARCHAR          ,       Price VARCHAR);");
		db.execSQL("INSERT INTO bread_Dhanmondi VALUES         ( 'Food Item            ',      'Price')");
		db.execSQL("INSERT INTO bread_Dhanmondi VALUES         ( 'Milk Bread           ',      ' 70TK')");
		db.execSQL("INSERT INTO bread_Dhanmondi VALUES         ( 'Burger Bun           ',      ' 50TK')");
		db.execSQL("INSERT INTO bread_Dhanmondi VALUES         ( 'Butter Cookies       ',      '110TK')");
		db.execSQL("INSERT INTO bread_Dhanmondi VALUES         ( 'Crispy Cookies       ',      '150TK')");
		db.execSQL("INSERT INTO bread_Dhanmondi VALUES         ( 'Salted Cookies       ',      '160TK')");
		db.execSQL("INSERT INTO bread_Dhanmondi VALUES         ( 'Chilli Toast         ',      ' 70TK')");
		db.execSQL("INSERT INTO bread_Dhanmondi VALUES         ( 'Garlic Toast         ',      ' 70TK')");
		db.execSQL("INSERT INTO bread_Dhanmondi VALUES         ( 'Caroot Cake          ',      '120TK')");
		db.execSQL("INSERT INTO bread_Dhanmondi VALUES         ( 'Basboosa             ',      ' 75TK')");
		db.execSQL("INSERT INTO bread_Dhanmondi VALUES         ( 'Lemon Tart           ',      ' 70TK')");
		db.close();				
		Information.setTableName("bread_Dhanmondi");
		Information.setAddress("Address:  House - 56 (Ground Floor), 3/A Shatmoshjid Road ");
		Information.setContactNum("Call: +8801841-320944");
		
		Intent intent = new Intent(Dhanmondi.this,Information.class);
		startActivity(intent);
	}
});
baburchi.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("BABURCHI_Dhanmondi", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS BABURCHI_Dhanmondi");
		db.execSQL("CREATE TABLE IF NOT EXISTS BABURCHI_Dhanmondi ( Menu VARCHAR          ,       Price VARCHAR);");
		db.execSQL("INSERT INTO BABURCHI_Dhanmondi VALUES         ( 'Food Item            ',      'Price')");
		db.execSQL("INSERT INTO BABURCHI_Dhanmondi VALUES         ( 'Chicken Pakura       ',      '125TK')");
		db.execSQL("INSERT INTO BABURCHI_Dhanmondi VALUES         ( 'Veggie Pakura        ',      '195TK')");
		db.execSQL("INSERT INTO BABURCHI_Dhanmondi VALUES         ( 'Plain Polao          ',      '180TK')");
		db.execSQL("INSERT INTO BABURCHI_Dhanmondi VALUES         ( 'Kashmiri Polao       ',      '230TK')");
		db.execSQL("INSERT INTO BABURCHI_Dhanmondi VALUES         ( 'Chicken Jhalfrezi    ',      '350TK')");
		db.execSQL("INSERT INTO BABURCHI_Dhanmondi VALUES         ( 'Brain Masala         ',      '300TK')");
		db.execSQL("INSERT INTO BABURCHI_Dhanmondi VALUES         ( 'Rashmi Kabab         ',      '280TK')");
		db.execSQL("INSERT INTO BABURCHI_Dhanmondi VALUES         ( 'Tandoori Chicken     ',      '130TK')");
		db.execSQL("INSERT INTO BABURCHI_Dhanmondi VALUES         ( 'Butter Naan          ',      ' 60TK')");
		db.execSQL("INSERT INTO BABURCHI_Dhanmondi VALUES         ( 'Mixed Salad          ',      '130TK')");
		db.close();				
		Information.setTableName("BABURCHI_Dhanmondi");
		Information.setAddress("Address: House - 55/A, Road, 4/A, Satmasjid Road, Dhanmondi");
		Information.setContactNum("Call: 01611-122222");
		
		Intent intent = new Intent(Dhanmondi.this,Information.class);
		startActivity(intent);
	}
});
mango.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("MANGO_Dhanmondi", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS MANGO_Dhanmondi");
		db.execSQL("CREATE TABLE IF NOT EXISTS MANGO_Dhanmondi ( Menu VARCHAR           ,       Price VARCHAR);");
		db.execSQL("INSERT INTO MANGO_Dhanmondi VALUES         ( 'Food Item             ',      'Price')");
		db.execSQL("INSERT INTO MANGO_Dhanmondi VALUES         ( 'Chicken Salad         ',      '210TK')");
		db.execSQL("INSERT INTO MANGO_Dhanmondi VALUES         ( 'French Fries          ',      '120TK')");
		db.execSQL("INSERT INTO MANGO_Dhanmondi VALUES         ( 'Kebab Roll (Beef)     ',      '140TK')");
		db.execSQL("INSERT INTO MANGO_Dhanmondi VALUES         ( 'Kebab Roll (Chicken)  ',      '140TK')");
		db.execSQL("INSERT INTO MANGO_Dhanmondi VALUES         ( 'Pepper Steak          ',      '520TK')");
		db.execSQL("INSERT INTO MANGO_Dhanmondi VALUES         ( 'American Steak        ',      '600TK')");
		db.execSQL("INSERT INTO MANGO_Dhanmondi VALUES         ( 'Chicken Steak         ',      '460TK')");
		db.execSQL("INSERT INTO MANGO_Dhanmondi VALUES         ( 'Chicken Pasta         ',      '300TK')");
		db.execSQL("INSERT INTO MANGO_Dhanmondi VALUES         ( 'Prawn Chowmein        ',      '300TK')");
		db.execSQL("INSERT INTO MANGO_Dhanmondi VALUES         ( 'Chicken Cheese Burger ',      '115TK')");
		db.execSQL("INSERT INTO MANGO_Dhanmondi VALUES         ( 'Chocolate             ',      '100TK')");
		db.close();				
		Information.setTableName("MANGO_Dhanmondi");
		Information.setAddress("Address: Road # 6, House # 5, Dhanmondi");
		Information.setContactNum("Call: +8801819421564");
		
		Intent intent = new Intent(Dhanmondi.this,Information.class);
		startActivity(intent);
	}
});
		
dhaba.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				SQLiteDatabase db = openOrCreateDatabase("DHABA_Dhanmondi", MODE_PRIVATE, null);
				db.execSQL("DROP TABLE IF EXISTS DHABA_Dhanmondi");
				db.execSQL("CREATE TABLE IF NOT EXISTS DHABA_Dhanmondi ( Menu VARCHAR          ,       Price VARCHAR);");
				db.execSQL("INSERT INTO DHABA_Dhanmondi VALUES         ( 'Food Item            ',      'Price')");
				db.execSQL("INSERT INTO DHABA_Dhanmondi VALUES         ( 'Plain Dosa           ',      '150TK')");
				db.execSQL("INSERT INTO DHABA_Dhanmondi VALUES         ( 'Masala Dosa          ',      '200TK')");
				db.execSQL("INSERT INTO DHABA_Dhanmondi VALUES         ( 'Special Masala Dosa  ',      '240TK')");
				db.execSQL("INSERT INTO DHABA_Dhanmondi VALUES         ( 'Plain Uttapam        ',      '130TK')");
				db.execSQL("INSERT INTO DHABA_Dhanmondi VALUES         ( 'Masala Uttapam       ',      '150TK')");
				db.execSQL("INSERT INTO DHABA_Dhanmondi VALUES         ( 'Papri Chaat          ',      '115TK')");
				db.execSQL("INSERT INTO DHABA_Dhanmondi VALUES         ( 'Dahi Phuchka         ',      '100TK')");
				db.execSQL("INSERT INTO DHABA_Dhanmondi VALUES         ( 'Pani Puri            ',      ' 85TK')");
				db.execSQL("INSERT INTO DHABA_Dhanmondi VALUES         ( 'Aloo Chaap           ',      ' 90TK')");
				db.execSQL("INSERT INTO DHABA_Dhanmondi VALUES         ( 'Raj Kachori          ',      '115TK')");
				db.close();				
				Information.setTableName("DHABA_Dhanmondi");
				Information.setAddress("Address: House 89/2 Road 12/A");
				Information.setContactNum("Call: +8801819421564");
				
				Intent intent = new Intent(Dhanmondi.this,Information.class);
				startActivity(intent);
			}
		});
dominus.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				SQLiteDatabase db = openOrCreateDatabase("Dominus_Dhanmondi", MODE_PRIVATE, null);
				db.execSQL("DROP TABLE IF EXISTS Dominus_Dhanmondi");
				db.execSQL("CREATE TABLE IF NOT EXISTS Dominus_Dhanmondi ( Menu VARCHAR          ,       Price VARCHAR);");
				db.execSQL("INSERT INTO Dominus_Dhanmondi VALUES         ( 'Food Item            ',      'Price')");
				db.execSQL("INSERT INTO Dominus_Dhanmondi VALUES         ( 'Chicken Pizza        ',      '250TK')");
				db.execSQL("INSERT INTO Dominus_Dhanmondi VALUES         ( 'Beef Pizza           ',      '200TK')");
				db.execSQL("INSERT INTO Dominus_Dhanmondi VALUES         ( 'Mexican Pizza        ',      '240TK')");
				db.execSQL("INSERT INTO Dominus_Dhanmondi VALUES         ( 'French Fries         ',      ' 75TK')");
				db.execSQL("INSERT INTO Dominus_Dhanmondi VALUES         ( 'Onion Ring           ',      '115TK')");
				db.execSQL("INSERT INTO Dominus_Dhanmondi VALUES         ( 'Cream Soup(Chicken)  ',      '345TK')");
				db.execSQL("INSERT INTO Dominus_Dhanmondi VALUES         ( 'Cream Soup(Mushroom) ',      '345TK')");
				db.execSQL("INSERT INTO Dominus_Dhanmondi VALUES         ( 'Seafood Pizza        ',      '305TK')");
				db.execSQL("INSERT INTO Dominus_Dhanmondi VALUES         ( 'Dominous Ring Pizza  ',      '425TK')");
				db.execSQL("INSERT INTO Dominus_Dhanmondi VALUES         ( 'Shrimps Pizza        ',      '305TK')");
				db.close();				
				Information.setTableName("Dominus_Dhanmondi");
				Information.setAddress("Address: House-39, Rd-2, Dhanmondi");
				Information.setContactNum("Call: +88029671192");
				
				Intent intent = new Intent(Dhanmondi.this,Information.class);
				startActivity(intent);
			}
		});
korai.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("korai_Dhanmondi", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS korai_Dhanmondi");
		db.execSQL("CREATE TABLE IF NOT EXISTS korai_Dhanmondi ( Menu VARCHAR          ,       Price VARCHAR);");
		db.execSQL("INSERT INTO korai_Dhanmondi VALUES         ( 'Food Item            ',      'Price')");
		db.execSQL("INSERT INTO korai_Dhanmondi VALUES         ( 'Plain Dosa           ',      '150TK')");
		db.execSQL("INSERT INTO korai_Dhanmondi VALUES         ( 'Masala Dosa          ',      '200TK')");
		db.execSQL("INSERT INTO korai_Dhanmondi VALUES         ( 'Special Masala Dosa  ',      '240TK')");
		db.execSQL("INSERT INTO korai_Dhanmondi VALUES         ( 'Plain Uttapam        ',      '130TK')");
		db.execSQL("INSERT INTO korai_Dhanmondi VALUES         ( 'Masala Uttapam       ',      '150TK')");
		db.execSQL("INSERT INTO korai_Dhanmondi VALUES         ( 'Papri Chaat          ',      '115TK')");
		db.execSQL("INSERT INTO korai_Dhanmondi VALUES         ( 'Dahi Phuchka         ',      '100TK')");
		db.execSQL("INSERT INTO korai_Dhanmondi VALUES         ( 'Pani Puri            ',      ' 85TK')");
		db.execSQL("INSERT INTO korai_Dhanmondi VALUES         ( 'Aloo Chaap           ',      ' 90TK')");
		db.execSQL("INSERT INTO korai_Dhanmondi VALUES         ( 'Raj Kachori          ',      '115TK')");
		db.close();				
		Information.setTableName("korai_Dhanmondi");
		Information.setAddress("Address: Dhanmondi road 11 ");
		Information.setContactNum("Call: +8801819421564");
		
		Intent intent = new Intent(Dhanmondi.this,Information.class);
		startActivity(intent);
	}
});
labamba.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("labamba_Dhanmondi", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS labamba_Dhanmondi");
		db.execSQL("CREATE TABLE IF NOT EXISTS labamba_Dhanmondi ( Menu VARCHAR          ,       Price VARCHAR);");
		db.execSQL("INSERT INTO labamba_Dhanmondi VALUES         ( 'Food Item            ',      'Price')");
		db.execSQL("INSERT INTO labamba_Dhanmondi VALUES         ( 'Plain Dosa           ',      '150TK')");
		db.execSQL("INSERT INTO labamba_Dhanmondi VALUES         ( 'Masala Dosa          ',      '200TK')");
		db.execSQL("INSERT INTO labamba_Dhanmondi VALUES         ( 'Special Masala Dosa  ',      '240TK')");
		db.execSQL("INSERT INTO labamba_Dhanmondi VALUES         ( 'Plain Uttapam        ',      '130TK')");
		db.execSQL("INSERT INTO labamba_Dhanmondi VALUES         ( 'Masala Uttapam       ',      '150TK')");
		db.execSQL("INSERT INTO labamba_Dhanmondi VALUES         ( 'Papri Chaat          ',      '115TK')");
		db.execSQL("INSERT INTO labamba_Dhanmondi VALUES         ( 'Dahi Phuchka         ',      '100TK')");
		db.execSQL("INSERT INTO labamba_Dhanmondi VALUES         ( 'Pani Puri            ',      ' 85TK')");
		db.execSQL("INSERT INTO labamba_Dhanmondi VALUES         ( 'Aloo Chaap           ',      ' 90TK')");
		db.execSQL("INSERT INTO labamba_Dhanmondi VALUES         ( 'Raj Kachori          ',      '115TK')");
		db.close();				
		Information.setTableName("labamba_Dhanmondi");
		Information.setAddress("Address: Dhanmondi 11 ");
		Information.setContactNum("Call: +8801819421564");
		
		Intent intent = new Intent(Dhanmondi.this,Information.class);
		startActivity(intent);
	}
});
rizbiz.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("RIZBIZ_Dhanmondi", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS RIZBIZ_Dhanmondi");
		db.execSQL("CREATE TABLE IF NOT EXISTS RIZBIZ_Dhanmondi ( Menu VARCHAR          ,       Price VARCHAR);");
		db.execSQL("INSERT INTO RIZBIZ_Dhanmondi VALUES         ( 'Food Item            ',      'Price')");
		db.execSQL("INSERT INTO RIZBIZ_Dhanmondi VALUES         ( 'Plain Dosa           ',      '150TK')");
		db.execSQL("INSERT INTO RIZBIZ_Dhanmondi VALUES         ( 'Masala Dosa          ',      '200TK')");
		db.execSQL("INSERT INTO RIZBIZ_Dhanmondi VALUES         ( 'Special Masala Dosa  ',      '240TK')");
		db.execSQL("INSERT INTO RIZBIZ_Dhanmondi VALUES         ( 'Plain Uttapam        ',      '130TK')");
		db.execSQL("INSERT INTO RIZBIZ_Dhanmondi VALUES         ( 'Masala Uttapam       ',      '150TK')");
		db.execSQL("INSERT INTO RIZBIZ_Dhanmondi VALUES         ( 'Papri Chaat          ',      '115TK')");
		db.execSQL("INSERT INTO RIZBIZ_Dhanmondi VALUES         ( 'Dahi Phuchka         ',      '100TK')");
		db.execSQL("INSERT INTO RIZBIZ_Dhanmondi VALUES         ( 'Pani Puri            ',      ' 85TK')");
		db.execSQL("INSERT INTO RIZBIZ_Dhanmondi VALUES         ( 'Aloo Chaap           ',      ' 90TK')");
		db.execSQL("INSERT INTO RIZBIZ_Dhanmondi VALUES         ( 'Raj Kachori          ',      '115TK')");
		db.close();				
		Information.setTableName("RIZBIZ_Dhanmondi");
		Information.setAddress("Address: Dhanmondi 11 ");
		Information.setContactNum("Call: +8801819421564");
		
		Intent intent = new Intent(Dhanmondi.this,Information.class);
		startActivity(intent);
	}
});
nandoos.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("Nandoos_Dhanmondi", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS Nandoos_Dhanmondi");
		db.execSQL("CREATE TABLE IF NOT EXISTS Nandoos_Dhanmondi ( Menu VARCHAR          ,       Price VARCHAR);");
		db.execSQL("INSERT INTO Nandoos_Dhanmondi VALUES         ( 'Food Item            ',      'Price')");
		db.execSQL("INSERT INTO Nandoos_Dhanmondi VALUES         ( 'Peri peri Chicken   ',       '280TK')");
		db.execSQL("INSERT INTO Nandoos_Dhanmondi VALUES         ( 'Chicken Burger      ',       '200TK')");
		db.execSQL("INSERT INTO Nandoos_Dhanmondi VALUES         ( 'French Fry          ',       '50TK')");
		db.execSQL("INSERT INTO Nandoos_Dhanmondi VALUES         ( 'Coleslaw            ',       '50TK')");
		db.execSQL("INSERT INTO Nandoos_Dhanmondi VALUES         ( 'Ginger Burger       ',       '225TK')");
		db.execSQL("INSERT INTO Nandoos_Dhanmondi VALUES         ( 'Vegetable Burger    ',       '200TK')");
		db.execSQL("INSERT INTO Nandoos_Dhanmondi VALUES         ( 'Grilled Chicken     ',       '190TK')");
		db.execSQL("INSERT INTO Nandoos_Dhanmondi VALUES         ( 'Goa Lemon           ',       '180TK')");
		db.execSQL("INSERT INTO Nandoos_Dhanmondi VALUES         ( 'Popcorn Chicken     ',      '100TK')");
		db.close();				
		Information.setTableName("Nandoos_Dhanmondi");
		Information.setAddress("Address:  House 43, Ground Floor Road No.16");
		Information.setContactNum("Call: +8802-8128125");
		
		Intent intent = new Intent(Dhanmondi.this,Information.class);
		startActivity(intent);
	}
});
western.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("WESTERN_Dhanmondi", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS WESTERN_Dhanmondi");
		db.execSQL("CREATE TABLE IF NOT EXISTS WESTERN_Dhanmondi ( Menu VARCHAR             ,       Price VARCHAR);");
		db.execSQL("INSERT INTO WESTERN_Dhanmondi VALUES         ( 'Food Item               ',      'Price')");
		db.execSQL("INSERT INTO WESTERN_Dhanmondi VALUES         ( 'Chicken 21              ',      '260TK')");
		db.execSQL("INSERT INTO WESTERN_Dhanmondi VALUES         ( 'Spaghetti Meal          ',      '245TK')");
		db.execSQL("INSERT INTO WESTERN_Dhanmondi VALUES         ( 'Chicken Delight         ',      '335TK')");
		db.execSQL("INSERT INTO WESTERN_Dhanmondi VALUES         ( 'Crunchy Chicken Burger  ',      '235TK')");
		db.execSQL("INSERT INTO WESTERN_Dhanmondi VALUES         ( 'Beef Burger             ',      '210TK')");
		db.execSQL("INSERT INTO WESTERN_Dhanmondi VALUES         ( 'Pan Pizza Beef          ',      '340TK')");
		db.execSQL("INSERT INTO WESTERN_Dhanmondi VALUES         ( 'Pan Pizza Chicken       ',      '340TK')");
		db.execSQL("INSERT INTO WESTERN_Dhanmondi VALUES         ( 'Pan Pizza Vegetable     ',      '340TK')");
		db.execSQL("INSERT INTO WESTERN_Dhanmondi VALUES         ( 'Chicken Supreme Burger  ',      '240TK')");
		db.execSQL("INSERT INTO WESTERN_Dhanmondi VALUES         ( 'Ultimate Cheese Burger  ',      '295TK')");
		db.close();				
		Information.setTableName("WESTERN_Dhanmondi");
		Information.setAddress("Address: House - 5/2, Road - 4, Dhanmondi R/A");
		Information.setContactNum("Call: +8801749421564");
		
		Intent intent = new Intent(Dhanmondi.this,Information.class);
		startActivity(intent);
	}
  });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dhanmondi, menu);
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
