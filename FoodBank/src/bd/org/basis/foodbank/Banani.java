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

public class Banani extends Activity {
    
	Button bfc,boomers,hollywood,dhaba,nandoos,live,loiter,preetom,red,star,timeout,tastebud,tarka;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_banani);
		bfc = (Button) findViewById(R.id.Button_BFC);
		boomers = (Button) findViewById(R.id.Button_BOOMERS_CAFE);
		hollywood = (Button) findViewById(R.id.Button_CAFE_HOLLYWOOD);
		dhaba = (Button) findViewById(R.id.Button_DHABA);
		nandoos = (Button) findViewById(R.id.Button_NANDOS);
		live = (Button) findViewById(R.id.Button_LIVE_KITCHEN);
		loiter = (Button) findViewById(R.id.Button_LOITER);
		preetom = (Button) findViewById(R.id.Button_PREETOM);
		red = (Button) findViewById(R.id.Button_RED_EMPEROR);
		star = (Button) findViewById(R.id.Button_STAR_KABAB);
		timeout = (Button) findViewById(R.id.Button_TIMEOUT);
		tastebud = (Button) findViewById(R.id.Button_TASTEBUD);
		tarka = (Button)  findViewById(R.id.Button_TARKA);
		
	bfc.setOnClickListener(new OnClickListener() {
			@Override
	        public void onClick(View v) {
						SQLiteDatabase db = openOrCreateDatabase("BFC_Banani", MODE_PRIVATE, null);
						db.execSQL("DROP TABLE IF EXISTS BFC_Banani");
						db.execSQL("CREATE TABLE IF NOT EXISTS BFC_Banani ( Menu VARCHAR           ,         Price VARCHAR);");
						db.execSQL("INSERT INTO BFC_Banani VALUES         ( 'Food Item             ',       'Price')");
						db.execSQL("INSERT INTO BFC_Banani VALUES         ( 'Fried Chicken         ',       ' 80TK')");
						db.execSQL("INSERT INTO BFC_Banani VALUES         ( 'Chicken Burger        ',       '200TK')");
						db.execSQL("INSERT INTO BFC_Banani VALUES         ( 'French Fry            ',       ' 50TK')");
						db.execSQL("INSERT INTO BFC_Banani VALUES         ( 'Coleslaw              ',       ' 50TK')");
						db.execSQL("INSERT INTO BFC_Banani VALUES         ( 'Chicken Cheese Burger ',       '250TK')");
						db.execSQL("INSERT INTO BFC_Banani VALUES         ( 'Chicken Wings(4 PCS)  ',       '150TK')");
						db.execSQL("INSERT INTO BFC_Banani VALUES         ( 'Chicken Wings(6 PCS)  ',       '180TK')");
						db.execSQL("INSERT INTO BFC_Banani VALUES         ( 'Chicken Bucket        ',       '600TK')");
						db.execSQL("INSERT INTO BFC_Banani VALUES         ( 'Chicken Ball(8 PCS)   ',       '200TK')");
						db.execSQL("INSERT INTO BFC_Banani VALUES         ( 'Fried Rice            ',       '150TK')");
						db.execSQL("INSERT INTO BFC_Banani VALUES         ( 'Drinks                ',       ' 40TK')");
						db.close();				
						Information.setTableName("BFC_Banani");
						Information.setAddress("Address: Banani 11 Block D");
						Information.setContactNum("Call: +8801682775957");
						
						Intent intent = new Intent(Banani.this,Information.class);
						startActivity(intent);
					}
				});
	boomers.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View v) {
					SQLiteDatabase db = openOrCreateDatabase("BOOMERS_Banani", MODE_PRIVATE, null);
					db.execSQL("DROP TABLE IF EXISTS BOOMERS_Banani");
					db.execSQL("CREATE TABLE IF NOT EXISTS BOOMERS_Banani ( Menu VARCHAR               ,       Price VARCHAR);");
					db.execSQL("INSERT INTO BOOMERS_Banani VALUES         ( 'Food Item                ',       'Price')");
					db.execSQL("INSERT INTO BOOMERS_Banani VALUES         ( 'Thai Soup                ',       '110TK')");
					db.execSQL("INSERT INTO BOOMERS_Banani VALUES         ( 'Tandoori Chicken         ',       '700TK')");
					db.execSQL("INSERT INTO BOOMERS_Banani VALUES         ( 'Plain Naan               ',       ' 40TK')");
					db.execSQL("INSERT INTO BOOMERS_Banani VALUES         ( 'Butter Naan              ',       ' 45TK')");
					db.execSQL("INSERT INTO BOOMERS_Banani VALUES         ( 'Spring Roll              ',       '2200TK')");
					db.execSQL("INSERT INTO BOOMERS_Banani VALUES         ( 'Cheese Burger            ',       '190TK')");
					db.execSQL("INSERT INTO BOOMERS_Banani VALUES         ( 'Fish Burger              ',       '190TK')");
					db.execSQL("INSERT INTO BOOMERS_Banani VALUES         ( 'Beef Burger              ',       '130TK')");
					db.execSQL("INSERT INTO BOOMERS_Banani VALUES         ( 'Chana Masala             ',       '130TK')");
					db.execSQL("INSERT INTO BOOMERS_Banani VALUES         ( 'Tandoori chicken(Half)   ',       '360TK')");
					db.execSQL("INSERT INTO BOOMERS_Banani VALUES         ( 'Tandoori Chicken(Full)   ',       '700TK')");
					db.execSQL("INSERT INTO BOOMERS_Banani VALUES         ( 'Beef Gordita             ',       '200TK')");
					db.close();				
					Information.setTableName("BOOMERS_Banani");
					Information.setAddress("Address: Banani 11 Block E");
					Information.setContactNum("Call: +8801675110460");
					
					Intent intent = new Intent(Banani.this,Information.class);
					startActivity(intent);
				}
			});
	hollywood.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View v) {
					SQLiteDatabase db = openOrCreateDatabase("Hollywood_Banani", MODE_PRIVATE, null);
					db.execSQL("DROP TABLE IF EXISTS Hollywood_Banani");
					db.execSQL("CREATE TABLE IF NOT EXISTS Hollywood_Banani ( Menu VARCHAR                          ,        Price VARCHAR);");
					db.execSQL("INSERT INTO Hollywood_Banani VALUES         ( 'Food Item                           ',       'Price')");
					db.execSQL("INSERT INTO Hollywood_Banani VALUES         ( 'Wonthon                             ',       '130TK')");
					db.execSQL("INSERT INTO Hollywood_Banani VALUES         ( 'French Fries                        ',       '120TK')");
					db.execSQL("INSERT INTO Hollywood_Banani VALUES         ( 'Fish And Chips                      ',       '350TK')");
					db.execSQL("INSERT INTO Hollywood_Banani VALUES         ( 'Nachos                              ',       '250TK')");
					db.execSQL("INSERT INTO Hollywood_Banani VALUES         ( 'Thai Soup                           ',       '150TK')");
					db.execSQL("INSERT INTO Hollywood_Banani VALUES         ( 'Coleslaw                            ',       ' 70TK')");
					db.execSQL("INSERT INTO Hollywood_Banani VALUES         ( 'Mexican Rice                        ',       '240TK')");
					db.execSQL("INSERT INTO Hollywood_Banani VALUES         ( 'Plain Parata                        ',       ' 40TK')");
					db.execSQL("INSERT INTO Hollywood_Banani VALUES         ( 'Chicken Pasta                       ',       '280TK')");
					db.execSQL("INSERT INTO Hollywood_Banani VALUES         ( 'Pad Thai                            ',       '250TK')");
					db.execSQL("INSERT INTO Hollywood_Banani VALUES         ( 'Pineapple Fried Rice                ',       '190TK')");
					db.execSQL("INSERT INTO Hollywood_Banani VALUES         ( 'Mango Sticky Rice                   ',       '250TK')");
					db.execSQL("INSERT INTO Hollywood_Banani VALUES         ( 'Fried Banana With Honey Dressing    ',       '160TK')");
					db.close();				
					Information.setTableName("Hollywood_Banani");
					Information.setAddress("Address: Banani 7 Block F");
					Information.setContactNum("Call: +8801817019699");
					
					Intent intent = new Intent(Banani.this,Information.class);
					startActivity(intent);
				}
			});

	dhaba.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			SQLiteDatabase db = openOrCreateDatabase("DHABA_Banani", MODE_PRIVATE, null);
			db.execSQL("DROP TABLE IF EXISTS DHABA_Banani");
			db.execSQL("CREATE TABLE IF NOT EXISTS DHABA_Banani ( Menu VARCHAR           ,       Price VARCHAR);");
			db.execSQL("INSERT INTO DHABA_Banani VALUES         ( 'Food Item             ',      'Price')");
			db.execSQL("INSERT INTO DHABA_Banani VALUES         ( 'Plain Dosa            ',      '150TK')");
			db.execSQL("INSERT INTO DHABA_Banani VALUES         ( 'Masala Dosa           ',      '200TK')");
			db.execSQL("INSERT INTO DHABA_Banani VALUES         ( 'Special Masala Dosa   ',      '240TK')");
			db.execSQL("INSERT INTO DHABA_Banani VALUES         ( 'Plain Uttapam         ',      '130TK')");
			db.execSQL("INSERT INTO DHABA_Banani VALUES         ( 'Masala Uttapam        ',      '150TK')");
			db.execSQL("INSERT INTO DHABA_Banani VALUES         ( 'Papri Chaat           ',      '115TK')");
			db.execSQL("INSERT INTO DHABA_Banani VALUES         ( 'Dahi Phuchka          ',      '100TK')");
			db.execSQL("INSERT INTO DHABA_Banani VALUES         ( 'Pani Puri             ',      ' 85TK')");
			db.execSQL("INSERT INTO DHABA_Banani VALUES         ( 'Aloo Chaap            ',      ' 90TK')");
			db.execSQL("INSERT INTO DHABA_Banani VALUES         ( 'Raj Kachori           ',      '115TK')");
			db.execSQL("INSERT INTO DHABA_Banani VALUES         ( 'Vegetable Sizzlers    ',      '385TK')");
			db.execSQL("INSERT INTO DHABA_Banani VALUES         ( 'American Chopsuey     ',      '410TK')");
			db.execSQL("INSERT INTO DHABA_Banani VALUES         ( 'Chinese Chopsuey      ',      '410TK')");
			db.execSQL("INSERT INTO DHABA_Banani VALUES         ( 'Gravy Seafood Noodles ',      '385TK')");
			db.close();				
			Information.setTableName("DHABA_Banani");
			Information.setAddress("Address: Banani 11 Block H");
			Information.setContactNum("Call: +8801819421564");
			
			Intent intent = new Intent(Banani.this,Information.class);
			startActivity(intent);
		}
	});
nandoos.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			SQLiteDatabase db = openOrCreateDatabase("NANDOOS_Banani", MODE_PRIVATE, null);
			db.execSQL("DROP TABLE IF EXISTS NANDOOS_Banani");
			db.execSQL("CREATE TABLE IF NOT EXISTS NANDOOS_Banani ( Menu VARCHAR         ,       Price VARCHAR);");
			db.execSQL("INSERT INTO NANDOOS_Banani VALUES         ( 'Food Item           ',      'Price')");
			db.execSQL("INSERT INTO NANDOOS_Banani VALUES         ( 'Peri peri Chicken   ',       '280TK')");
			db.execSQL("INSERT INTO NANDOOS_Banani VALUES         ( 'Chicken Burger      ',       '200TK')");
			db.execSQL("INSERT INTO NANDOOS_Banani VALUES         ( 'French Fry          ',       '50TK')");
			db.execSQL("INSERT INTO NANDOOS_Banani VALUES         ( 'Coleslaw            ',       '50TK')");
			db.execSQL("INSERT INTO NANDOOS_Banani VALUES         ( 'Ginger Burger       ',       '225TK')");
			db.execSQL("INSERT INTO NANDOOS_Banani VALUES         ( 'Vegetable Burger    ',       '200TK')");
			db.execSQL("INSERT INTO NANDOOS_Banani VALUES         ( 'Grilled Chicken     ',       '190TK')");
			db.execSQL("INSERT INTO NANDOOS_Banani VALUES         ( 'Goa Lemon           ',       '180TK')");
			db.execSQL("INSERT INTO NANDOOS_Banani VALUES         ( 'Beef Burger         ',       '250TK')");
			db.execSQL("INSERT INTO NANDOOS_Banani VALUES         ( 'Special Burger      ',       '300TK')");
			db.execSQL("INSERT INTO NANDOOS_Banani VALUES         ( 'Grilled Vegetable   ',       ' 80TK')");
			db.execSQL("INSERT INTO NANDOOS_Banani VALUES         ( 'Lemon Herb Chicken  ',       '280TK')");
			db.close();				
			Information.setTableName("NANDOOS_Banani");
			Information.setAddress("Address: Banani 8 Block D");
			Information.setContactNum("Call: +8801556364671");
			
			Intent intent = new Intent(Banani.this,Information.class);
			startActivity(intent);
		}
	});
live.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("Live_Banani", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS Live_Banani");
		db.execSQL("CREATE TABLE IF NOT EXISTS Live_Banani ( Menu VARCHAR                      ,        Price VARCHAR);");
		db.execSQL("INSERT INTO Live_Banani VALUES         ( 'Food Item                        ',       'Price')");
		db.execSQL("INSERT INTO Live_Banani VALUES         ( 'Fried Chicken                    ',       ' 80TK')");
		db.execSQL("INSERT INTO Live_Banani VALUES         ( 'Chicken Burger                   ',       '200TK')");
		db.execSQL("INSERT INTO Live_Banani VALUES         ( 'French Fry                       ',       ' 50TK')");
		db.execSQL("INSERT INTO Live_Banani VALUES         ( 'Coleslaw                         ',       ' 50TK')");
		db.execSQL("INSERT INTO Live_Banani VALUES         ( 'Ginger Burger                    ',       '225TK')");
		db.execSQL("INSERT INTO Live_Banani VALUES         ( 'Vegetable Burger                 ',       '200TK')");
		db.execSQL("INSERT INTO Live_Banani VALUES         ( 'Grilled Chicken                  ',       '190TK')");
		db.execSQL("INSERT INTO Live_Banani VALUES         ( 'Chicken Chesse Burger            ',       '180TK')");
		db.execSQL("INSERT INTO Live_Banani VALUES         ( 'Burgoholic Burger                ',       '350TK')");
		db.execSQL("INSERT INTO Live_Banani VALUES         ( 'Double Deck Beef Burger          ',       '200TK')");
		db.execSQL("INSERT INTO Live_Banani VALUES         ( 'Cheesy Delight                   ',       '250TK')");
		db.execSQL("INSERT INTO Live_Banani VALUES         ( 'Sphagetii with Garlic Sauce      ',       '230TK')");
		db.execSQL("INSERT INTO Live_Banani VALUES         ( 'Sphagetii with Meat Sauce        ',       '350TK')");
		db.close();				
		Information.setTableName("Live_Banani");
		Information.setAddress("Address: Banani 8 Block D");
		Information.setContactNum("Call: +8802-9348018");
		
		Intent intent = new Intent(Banani.this,Information.class);
		startActivity(intent);
	}
});
loiter.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("LOITER_Banani", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS LOITER_Banani");
		db.execSQL("CREATE TABLE IF NOT EXISTS LOITER_Banani ( Menu VARCHAR              ,       Price VARCHAR);");
		db.execSQL("INSERT INTO LOITER_Banani VALUES         ( 'Food Item                ',      'Price')");
		db.execSQL("INSERT INTO LOITER_Banani VALUES         ( 'Fried Chicken            ',      ' 80TK')");
		db.execSQL("INSERT INTO LOITER_Banani VALUES         ( 'Chicken Brochette        ',      '250TK')");
		db.execSQL("INSERT INTO LOITER_Banani VALUES         ( 'Rice with Grill Chicken  ',      '250TK')");
		db.execSQL("INSERT INTO LOITER_Banani VALUES         ( 'Coleslaw                 ',      ' 50TK')");
		db.execSQL("INSERT INTO LOITER_Banani VALUES         ( 'Grill Chicken            ',      '180TK')");
		db.execSQL("INSERT INTO LOITER_Banani VALUES         ( 'Beef Fried Rice          ',      '200TK')");
		db.execSQL("INSERT INTO LOITER_Banani VALUES         ( 'Fried Rice               ',      '190TK')");
		db.execSQL("INSERT INTO LOITER_Banani VALUES         ( 'Lemon Chicken            ',      '275TK')");
		db.execSQL("INSERT INTO LOITER_Banani VALUES         ( 'Chicken Chilli           ',      '250TK')");
		db.execSQL("INSERT INTO LOITER_Banani VALUES         ( 'Red Indian Chicken       ',      '280TK')");
		db.execSQL("INSERT INTO LOITER_Banani VALUES         ( 'Cream Caramel            ',      ' 45TK')");
		db.close();				
		Information.setTableName("LOITER_Banani");
		Information.setAddress("Address: Banani 8 Block D");
		Information.setContactNum("Call: +8802-8332455");
		
		Intent intent = new Intent(Banani.this,Information.class);
		startActivity(intent);
	}
});
preetom.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("PREETOM_Banani", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS PREETOM_Banani");
		db.execSQL("CREATE TABLE IF NOT EXISTS PREETOM_Banani ( Menu VARCHAR           ,        Price VARCHAR);");
		db.execSQL("INSERT INTO PREETOM_Banani VALUES         ( 'Food Item             ',       'Price')");
		db.execSQL("INSERT INTO PREETOM_Banani VALUES         ( 'Chicken Burger        ',       '320TK')");
		db.execSQL("INSERT INTO PREETOM_Banani VALUES         ( 'Beef Burger           ',       '3200TK')");
		db.execSQL("INSERT INTO PREETOM_Banani VALUES         ( 'Caramel Crunch        ',       '150TK')");
		db.execSQL("INSERT INTO PREETOM_Banani VALUES         ( 'Vegetable Burger      ',       '310TK')");
		db.execSQL("INSERT INTO PREETOM_Banani VALUES         ( 'BBQ Chicken Burger    ',       '280TK')");
		db.execSQL("INSERT INTO PREETOM_Banani VALUES         ( 'Chicken Cheese Burger ',       '200TK')");
		db.execSQL("INSERT INTO PREETOM_Banani VALUES         ( 'Beef Cheese Burger    ',       '250TK')");
		db.execSQL("INSERT INTO PREETOM_Banani VALUES         ( 'Coleslaw              ',       ' 50TK')");
		db.execSQL("INSERT INTO PREETOM_Banani VALUES         ( 'Half Pounder(Beef)    ',       '495TK')");
		db.execSQL("INSERT INTO PREETOM_Banani VALUES         ( 'Chowmein              ',       '150TK')");
		db.close();				
	    Information.setTableName("PREETOM_Banani");
		Information.setAddress("Address: 32, Kamal Ataturk Avenue");
		Information.setContactNum("Call: 01788-650022");
		
		Intent intent = new Intent(Banani.this,Information.class);
		startActivity(intent);
	}
});
red.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("RED_Banani", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS RED_Banani");
		db.execSQL("CREATE TABLE IF NOT EXISTS RED_Banani ( Menu VARCHAR          ,        Price VARCHAR);");
		db.execSQL("INSERT INTO RED_Banani VALUES         ( 'Food Item           ',       'Price')");
		db.execSQL("INSERT INTO RED_Banani VALUES         ( 'Fried Chicken       ',       ' 80TK')");
		db.execSQL("INSERT INTO RED_Banani VALUES         ( 'Chicken Burger      ',       '200TK')");
		db.execSQL("INSERT INTO RED_Banani VALUES         ( 'French Fry          ',       ' 50TK')");
		db.execSQL("INSERT INTO RED_Banani VALUES         ( 'Coleslaw            ',       ' 50TK')");
		db.execSQL("INSERT INTO RED_Banani VALUES         ( 'Grill Chicken       ',       '180TK')");
		db.execSQL("INSERT INTO RED_Banani VALUES         ( 'Beef Burger         ',       '200TK')");
		db.execSQL("INSERT INTO RED_Banani VALUES         ( 'Fried Rice          ',       '190TK')");
		db.execSQL("INSERT INTO RED_Banani VALUES         ( 'Prawn Ball          ',       '250TK')");
		db.execSQL("INSERT INTO RED_Banani VALUES         ( 'Thai Soup           ',       '200TK')");
		db.execSQL("INSERT INTO RED_Banani VALUES         ( 'Beef Burger         ',       '200TK')");
		db.execSQL("INSERT INTO RED_Banani VALUES         ( 'Vegetable Rice      ',       '190TK')");
		db.execSQL("INSERT INTO RED_Banani VALUES         ( 'Chicken Ball        ',       '250TK')");
		db.execSQL("INSERT INTO RED_Banani VALUES         ( 'Chicken Clear Soup  ',       '200TK')");
		db.close();				
		Information.setTableName("RED_Banani");
		Information.setAddress("Address: Banani 8 House 15 ");
		Information.setContactNum("Call: 01942-332211");
		
		Intent intent = new Intent(Banani.this,Information.class);
		startActivity(intent);
	}
});
star.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("Star_Banani", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS Star_Banani");
		db.execSQL("CREATE TABLE IF NOT EXISTS Star_Banani ( Menu VARCHAR           ,        Price VARCHAR);");
		db.execSQL("INSERT INTO Star_Banani VALUES         ( 'Food Item             ',       'Price')");
		db.execSQL("INSERT INTO Star_Banani VALUES         ( 'Kachchi Biriyani      ',       '120TK')");
		db.execSQL("INSERT INTO Star_Banani VALUES         ( 'Chicken Polao         ',       '130TK')");
		db.execSQL("INSERT INTO Star_Banani VALUES         ( 'Beef Khichuri         ',       '150TK')");
		db.execSQL("INSERT INTO Star_Banani VALUES         ( 'Mutton Khichuri       ',       '150TK')");
		db.execSQL("INSERT INTO Star_Banani VALUES         ( 'Sheek Kabab           ',       ' 80TK')");
		db.execSQL("INSERT INTO Star_Banani VALUES         ( 'Grill Chicken(Half)   ',       '150TK')");
		db.execSQL("INSERT INTO Star_Banani VALUES         ( 'Grill Chicken(Full)   ',       '320TK')");
		db.execSQL("INSERT INTO Star_Banani VALUES         ( 'Beef Jhal Fry         ',       '120TK')");
		db.execSQL("INSERT INTO Star_Banani VALUES         ( 'Faluda                ',       ' 50TK')");
		db.close();				
		Information.setTableName("Star_Banani");
		Information.setAddress("Address: Banani 11 Block C");
		Information.setContactNum("Call: +8802-9348018");
		
		Intent intent = new Intent(Banani.this,Information.class);
		startActivity(intent);
	}
});
timeout.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("Timeout_Banani", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS Timeout_Banani");
		db.execSQL("CREATE TABLE IF NOT EXISTS Timeout_Banani ( Menu VARCHAR           ,        Price VARCHAR);");
		db.execSQL("INSERT INTO Timeout_Banani VALUES         ( 'Food Item             ',       'Price')");
		db.execSQL("INSERT INTO Timeout_Banani VALUES         ( 'Chicken Fried Rice    ',       '320TK')");
		db.execSQL("INSERT INTO Timeout_Banani VALUES         ( 'Beef Fried Rice       ',       '3200TK')");
		db.execSQL("INSERT INTO Timeout_Banani VALUES         ( 'Chicken Steak         ',       '550TK')");
		db.execSQL("INSERT INTO Timeout_Banani VALUES         ( 'Beef Steak            ',       '510TK')");
		db.execSQL("INSERT INTO Timeout_Banani VALUES         ( 'BBQ Chicken Burger    ',       '280TK')");
		db.execSQL("INSERT INTO Timeout_Banani VALUES         ( 'Chicken Cheese Burger ',       '200TK')");
		db.execSQL("INSERT INTO Timeout_Banani VALUES         ( 'Beef Cheese Burger    ',       '250TK')");
		db.execSQL("INSERT INTO Timeout_Banani VALUES         ( 'Vegetable             ',       '150TK')");
		db.execSQL("INSERT INTO Timeout_Banani VALUES         ( 'Mushroom Steak        ',       '750TK')");
		db.execSQL("INSERT INTO Timeout_Banani VALUES         ( 'Coleslaw              ',       ' 50TK')");
		db.close();				
		Information.setTableName("Timeout_Banani");
		Information.setAddress("Address: Road 19A House 65/E Banani");
		Information.setContactNum("Call: +8801812213124");
		
		Intent intent = new Intent(Banani.this,Information.class);
		startActivity(intent);
	}
});
tastebud.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("tastebud_Banani", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS tastebud_Banani");
		db.execSQL("CREATE TABLE IF NOT EXISTS tastebud_Banani ( Menu VARCHAR           ,         Price VARCHAR);");
		db.execSQL("INSERT INTO tastebud_Banani VALUES         ( 'Food Item             ',       'Price')");
		db.execSQL("INSERT INTO tastebud_Banani VALUES         ( 'Red Valvet            ',       '120TK')");
		db.execSQL("INSERT INTO tastebud_Banani VALUES         ( 'Cheese Cake           ',       '220TK')");
		db.execSQL("INSERT INTO tastebud_Banani VALUES         ( 'Brownie               ',       ' 50TK')");
		db.execSQL("INSERT INTO tastebud_Banani VALUES         ( 'Oreo Cheese Cake      ',       '210TK')");
		db.execSQL("INSERT INTO tastebud_Banani VALUES         ( 'Strawberry Cake       ',       '280TK')");
		db.execSQL("INSERT INTO tastebud_Banani VALUES         ( 'Vanilla Cake          ',       '200TK')");
		db.execSQL("INSERT INTO tastebud_Banani VALUES         ( 'Mango Cake            ',       '250TK')");
		db.execSQL("INSERT INTO tastebud_Banani VALUES         ( 'Banoffee Pie          ',       '150TK')");
		db.execSQL("INSERT INTO tastebud_Banani VALUES         ( 'Tiramisu Slice        ',       '300TK')");
		db.execSQL("INSERT INTO tastebud_Banani VALUES         ( 'Onion Rings           ',       '150TK')");
		db.execSQL("INSERT INTO tastebud_Banani VALUES         ( 'Sauteed Mushrooms     ',       '170TK')");
		db.close();				
		Information.setTableName("tastebud_Banani");
		Information.setAddress("Address: House#52,Block H, Road No 12A");
		Information.setContactNum("Call: +880191859321");
		
		Intent intent = new Intent(Banani.this,Information.class);
		startActivity(intent);
	}
});
tarka.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		SQLiteDatabase db = openOrCreateDatabase("TARKA_Banani", MODE_PRIVATE, null);
		db.execSQL("DROP TABLE IF EXISTS TARKA_Banani");
		db.execSQL("CREATE TABLE IF NOT EXISTS TARKA_Banani ( Menu VARCHAR           ,        Price VARCHAR);");
		db.execSQL("INSERT INTO TARKA_Banani VALUES         ( 'Food Item             ',       'Price')");
		db.execSQL("INSERT INTO TARKA_Banani VALUES         ( 'Butter Naan           ',       ' 80TK')");
		db.execSQL("INSERT INTO TARKA_Banani VALUES         ( 'Kashmiri Naan         ',       '120TK')");
		db.execSQL("INSERT INTO TARKA_Banani VALUES         ( 'Masala Beef           ',       '350TK')");
		db.execSQL("INSERT INTO TARKA_Banani VALUES         ( 'Chicken Lasange Kabab ',       '310TK')");
		db.execSQL("INSERT INTO TARKA_Banani VALUES         ( 'Mughal Chicken        ',       '280TK')");
		db.execSQL("INSERT INTO TARKA_Banani VALUES         ( 'Beef Kabab            ',       '200TK')");
		db.execSQL("INSERT INTO TARKA_Banani VALUES         ( 'Chicken Jhal Fry      ',       '250TK')");
		db.execSQL("INSERT INTO TARKA_Banani VALUES         ( 'Tarka Special Roll    ',       '180TK')");
		db.execSQL("INSERT INTO TARKA_Banani VALUES         ( 'Sweet n Sour Roll     ',       '160TK')");
		db.execSQL("INSERT INTO TARKA_Banani VALUES         ( 'Jeera Pulao           ',       '200TK')");
		db.execSQL("INSERT INTO TARKA_Banani VALUES         ( 'Achari Aloo           ',       '280TK')");
		db.execSQL("INSERT INTO TARKA_Banani VALUES         ( 'Fish Anarkali         ',       '440TK')");
		db.execSQL("INSERT INTO TARKA_Banani VALUES         ( 'Gulab Jamun           ',       '150TK')");
		db.close();				
		Information.setTableName("TARKA_Banani");
		Information.setAddress("Address: House 153 (3rd Floor) Road 11, Block E");
		Information.setContactNum("Call: +8802-9348018");
		
		Intent intent = new Intent(Banani.this,Information.class);
		startActivity(intent);
	}
});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.banani, menu);
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
