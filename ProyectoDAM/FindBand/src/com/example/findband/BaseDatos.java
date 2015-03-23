package com.example.findband;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class BaseDatos extends SQLiteOpenHelper {
	
//	private static String DB_PATH = "data/data/com.example.findband/databases";
//	private static String DB_NAME = "db_findband";

	public BaseDatos(Context context, String name, CursorFactory factory,
			int version) {
		super(context, "dbase", factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		
		//CREACION TABLA ENLACES:
		db.execSQL("CREATE TABLE IF NOT EXISTS Enlaces(" +
				"Id_enlace CHAR(4) PRIMARY KEY," +
				"Enlace1 VARCHAR," +
				"Enlace2 VARCHAR," +
				"Enlace3 VARCHAR," +
				"Nombre1 VARCHAR," +
				"Nombre2 VARCHAR," +
				"Nombre3 VARCHAR);");
		
		//ROCK AND ROLL
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES" +
				"('0001','https://www.youtube.com/watch?v=SBmAPYkPeYU'," +
				"'https://www.youtube.com/watch?v=gj0Rz-uP4Mk'," +
				"'https://www.youtube.com/watch?v=3rQEbQJx5Bo'," +
				"'Suspicious Minds','Jailhouse Rock','All Shook Up');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES" +
				"('0002','https://www.youtube.com/watch?v=ZgdufzXvjqw'," +
				"'https://www.youtube.com/watch?v=HdlfZ4213zM'," +
				"'https://www.youtube.com/watch?v=E4iKCugYVhA'," +
				"'Rock Around The Clock','Rip It Up','See You Later Aligator');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES" +
				"('0003','https://www.youtube.com/watch?v=eWNykOk2ckE'," +
				"'https://www.youtube.com/watch?v=LvKDr8AgvK8'," +
				"'https://www.youtube.com/watch?v=RoDPPgWbfXY'," +
				"'Johnny B Good','Maybellene','You Never Can Tell');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES" +
				"('0004','https://www.youtube.com/watch?v=eFFgbc5Vcbw'," +
				"'https://www.youtube.com/watch?v=Mp43uumF0QY'," +
				"'https://www.youtube.com/watch?v=tpMaCUh569I'," +
				"'Long Tall Sally','She is Got It','Ready Teddy');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES" +
				"('0005','https://www.youtube.com/watch?v=8yRdDnrB5kM'," +
				"'https://www.youtube.com/watch?v=7IjgZGhHrYY'," +
				"'https://www.youtube.com/watch?v=9bXNbmXKFag'," +
				"'Whole Lotta Shaking Going On','Great Balls of Fire','Crazy Arms');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES" +
				"('0006','https://www.youtube.com/watch?v=bQQCPrwKzdo'," +
				"'https://www.youtube.com/watch?v=H1z45jVlM34'," +
				"'https://www.youtube.com/watch?v=aIz1cPfTRW4'," +
				"'Blueberry Hill','I am Walking To New Orleans','The Fat Man');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES" +
				"('0007','https://www.youtube.com/watch?v=MvPU-cvaKCM'," +
				"'https://www.youtube.com/watch?v=O0BbJ6WojhI'," +
				"'https://www.youtube.com/watch?v=tXTmuNOSh9E'," +
				"'Personality','Feeling good','Just Because');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES" +
				"('0008','https://www.youtube.com/watch?v=jmHNfWRw-qg'," +
				"'https://www.youtube.com/watch?v=It7107ELQvY'," +
				"'https://www.youtube.com/watch?v=t51MHUENlAQ'," +
				"'Walk The Line','Ring Of Fire','Man In Black');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES" +
				"('0009','https://www.youtube.com/watch?v=cHuJAC_XbhQ'," +
				"'https://www.youtube.com/watch?v=3SHlzvq1xRM'," +
				"'https://www.youtube.com/watch?v=E6etifUtauc'," +
				"'Slow Down','Bonny Maronie','Bad Boy');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES" +
				"('0010','https://www.youtube.com/watch?v=6om4ssqM2lc'," +
				"'https://www.youtube.com/watch?v=yFRirLor8n8'," +
				"'https://www.youtube.com/watch?v=nuK7z6mOwJ8'," +
				"'I Fought the Law','Please Dont Ever Change','Dont Cha Know');");
		
		//POP
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES" +
				"('0011','https://www.youtube.com/watch?v=Zi_XLOBDo_Y'," +
				"'https://www.youtube.com/watch?v=sOnqjkJTMaA'," +
				"'https://www.youtube.com/watch?v=oRdxUFDoQe0'," +
				"'Billy Jean','Thriller','Beat It');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES" +
				"('0012','https://www.youtube.com/watch?v=79fzeNUqQbQ'," +
				"'https://www.youtube.com/watch?v=GuJQSAiODqI'," +
				"'https://www.youtube.com/watch?v=zHW5RVvg2v4'," +
				"'Like a prayer','Vogue','Like a virgin');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES" +
				"('0013','https://www.youtube.com/watch?v=s3Q80mk7bxE'," +
				"'https://www.youtube.com/watch?v=ho7796-au8U'," +
				"'https://www.youtube.com/watch?v=o8HkEprSaAs'," +
				"'I Want You Back','ABC','Dancing Machine');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES" +
				"('0014','https://www.youtube.com/watch?v=QUOkg4jFNus'," +
				"'https://www.youtube.com/watch?v=Njq9Jj5Qhn0'," +
				"'https://www.youtube.com/watch?v=u5fvwbXEnYE'," +
				"'That is the Way Love Goes','All For You','Together Again');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES" +
				"('0015','https://www.youtube.com/watch?v=Zc4AeFz5BAY'," +
				"'https://www.youtube.com/watch?v=frv6FOt1BNI'," +
				"'https://www.youtube.com/watch?v=GWAKLNEVWB0'," +
				"'Cant Get You Out Of My Head','All The Lovers','Love At First Sight');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES" +
				"('0016','https://www.youtube.com/watch?v=eAfyFTzZDMM'," +
				"'https://www.youtube.com/watch?v=wwCykGDEp7M'," +
				"'https://www.youtube.com/watch?v=PstrAfoMKlc'," +
				"'Beautiful','Hurt','Fighter');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES" +
				"('0017','https://www.youtube.com/watch?v=PIb6AZdTr-A'," +
				"'https://www.youtube.com/watch?v=VdQY7BusJNU'," +
				"'https://www.youtube.com/watch?v=LPn0KFlbqX8'," +
				"'Girls Just Want To Have Fun','Time After Time','True Colors');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES" +
				"('0018','https://www.youtube.com/watch?v=C-u5WLJ9Yk4'," +
				"'https://www.youtube.com/watch?v=CduA0TULnow'," +
				"'https://www.youtube.com/watch?v=PZYSiWHW8V0'," +
				"'Baby One More Time','Oops!...I Did It Again','Overprotected');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES" +
				"('0019','https://www.youtube.com/watch?v=qrO4YZeyl0I'," +
				"'https://www.youtube.com/watch?v=niqrrmev4mA'," +
				"'https://www.youtube.com/watch?v=wagn8Wrmzuc'," +
				"'Bad Romance','Alejandro','Judas');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES" +
				"('0020','https://www.youtube.com/watch?v=7RMQksXpQSk'," +
				"'https://www.youtube.com/watch?v=CevxZvSJLk8'," +
				"'https://www.youtube.com/watch?v=k0BWlvnBmIE'," +
				"'This Is How We Do','Roar','Wide Awake');");
		
		//RAP
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES" +
				"('0021','https://www.youtube.com/watch?v=bUgOtitc7aU'," +
				"'https://www.youtube.com/watch?v=-hIjgofcuWU'," +
				"'https://www.youtube.com/watch?v=_9aYoEQxUCQ'," +
				"'Gangstas Dont Live That Long','Who Am I (Whats My Name)','Ups & Downs/Bang Out');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES" +
				"('0022','https://www.youtube.com/watch?v=vimZj8HW0Kg'," +
				"'https://www.youtube.com/watch?v=oVDfyc2lh4Q'," +
				"'https://www.youtube.com/watch?v=JQcAzie9AJ0'," +
				"'Mama Said Knock You Out','I am Bad','Headsprung');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES" +
				"('0023','https://www.youtube.com/watch?v=PSuxUPShjTA'," +
				"'https://www.youtube.com/watch?v=KP0OaUOQGCg'," +
				"'https://www.youtube.com/watch?v=_nODi6OECzs'," +
				"'G-Style','Colors','I am Your Pusher');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES" +
				"('0024','https://www.youtube.com/watch?v=Do5MMmEygsY'," +
				"'https://www.youtube.com/watch?v=Mb1ZvUDvLDY'," +
				"'https://www.youtube.com/watch?v=j0uQBwFMfBk'," +
				"'Ghetto Gospel','Dear Mama','Gangsta Party');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES" +
				"('0025','https://www.youtube.com/watch?v=HzeZhCt5PVA'," +
				"'https://www.youtube.com/watch?v=qrzCoXj6Prw'," +
				"'https://www.youtube.com/watch?v=-F41m_ywC0Y'," +
				"'Gangsta Rap Made Me Do It','Smoke Some Weed','Why We Thugs');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES" +
				"('0026','https://www.youtube.com/watch?v=mMWBh0B9F0M'," +
				"'https://www.youtube.com/watch?v=RijB8wnJCN0'," +
				"'https://www.youtube.com/watch?v=GqNGoAwYYk8'," +
				"'Lowrider','Insane In The Brain','Trouble');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES" +
				"('0027','https://www.youtube.com/watch?v=8PaoLy7PHwk'," +
				"'https://www.youtube.com/watch?v=pCx5Std7mCo'," +
				"'https://www.youtube.com/watch?v=8y_VFGrGnCE'," +
				"'Fight The Power','Harder Than You Think','He Got Game');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES" +
				"('0028','https://www.youtube.com/watch?v=VA770wpLX-Q'," +
				"'https://www.youtube.com/watch?v=QagknwNl6Q4'," +
				"'https://www.youtube.com/watch?v=wWJqt0u_TCs'," +
				"'I Need A Doctor','Xxplosive','Ring Ding Dong');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES" +
				"('0029','https://www.youtube.com/watch?v=gOMhN-hfMtY'," +
				"'https://www.youtube.com/watch?v=D4hAVemuQXY'," +
				"'https://www.youtube.com/watch?v=dRhFg5Z9IKk'," +
				"'Stan ft Dido','Sing For The Moment','Like Toy Soldiers');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES" +
				"('0030','https://www.youtube.com/watch?v=EYjiIsENvcc'," +
				"'https://www.youtube.com/watch?v=7pVfBW6N7QA'," +
				"'https://www.youtube.com/watch?v=Uuq6HgKgEFQ'," +
				"'My Band','Fight Music','Purple Hills');");
		
		//HEAVY METAL
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0031','https://www.youtube.com/watch?v=NZyVZFJGX5g'," +
				"'https://www.youtube.com/watch?v=9LjbMVXj0F8'," +
				"'https://www.youtube.com/watch?v=OGPD0ZBiMs0'," +
				"'Paranoid','Iron Man','War Pigs');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0032','https://www.youtube.com/watch?v=nM__lPTWThU'," +
				"'https://www.youtube.com/watch?v=L397TWLwrUU'," +
				"'https://www.youtube.com/watch?v=DUCRFMZ-hiY'," +
				"'Painkiller','Breaking the Law','The Hellion/Electric eyes');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0033','https://www.youtube.com/watch?v=dTaD9cd8hvw'," +
				"'https://www.youtube.com/watch?v=J51LPlP-s9o'," +
				"'https://www.youtube.com/watch?v=Nba3Tr_GLZU'," +
				"'The Trooper','Hallowed Be Thy Name','Fear Of The Dark');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0034','https://www.youtube.com/watch?v=aSsqavYIgNc'," +
				"'https://www.youtube.com/watch?v=F_JF8oSxXtM'," +
				"'https://www.youtube.com/watch?v=3VNUyjRRjxM'," +
				"'Ace Of Spades','The Game','Overkill');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0035','https://www.youtube.com/watch?v=K5jvUXij7nU'," +
				"'https://www.youtube.com/watch?v=KBtYOI8U3Cc'," +
				"'https://www.youtube.com/watch?v=aiQpRQeIiHY'," +
				"'Symphony Of Destruction','Holy Wars','Peace Sells');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0036','https://www.youtube.com/watch?v=WYnEqzui7lM'," +
				"'https://www.youtube.com/watch?v=uGHsxMqpL0c'," +
				"'https://www.youtube.com/watch?v=RzpRU347BDU'," +
				"'Caught In A Mosh','Madhouse','Indians');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0037','https://www.youtube.com/watch?v=Wnn47V09Q2M'," +
				"'https://www.youtube.com/watch?v=8CoGDjtBtVE'," +
				"'https://www.youtube.com/watch?v=qdDOWUPzrWA'," +
				"'Raining Blood','Black Magic','World Painted Blood');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0038','https://www.youtube.com/watch?v=NUAdgt5Glk0'," +
				"'https://www.youtube.com/watch?v=IZ7Aif5aXlQ'," +
				"'https://www.youtube.com/watch?v=WEQnzs8wl6E'," +
				"'Seek and Destroy','Battery','Fade to Black');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0039','https://www.youtube.com/watch?v=AkFqg5wAuFk'," +
				"'https://www.youtube.com/watch?v=1OYw7FPB7CE'," +
				"'https://www.youtube.com/watch?v=_XI1DD_vJuY'," +
				"'Walk','Cemetery Gates','Revolution is my name');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0040','https://www.youtube.com/watch?v=dl60yuTJXZg'," +
				"'https://www.youtube.com/watch?v=6ODNxy3YOPU'," +
				"'https://www.youtube.com/watch?v=0K4J90s1A2M'," +
				"'Amen','Refuse/Resist','Slave New World');");
		
		//HARD ROCK
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0041','https://www.youtube.com/watch?v=BcL---4xQYA'," +
				"'https://www.youtube.com/watch?v=sfR_HWMzgyc'," +
				"'https://www.youtube.com/watch?v=p6S9oqJRclo'," +
				"'Stairway To Heaven','Kashmir','Achilles Last Stand');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0042','https://www.youtube.com/watch?v=zUwEIt9ez7M'," +
				"'https://www.youtube.com/watch?v=PfAWReBmxEs'," +
				"'https://www.youtube.com/watch?v=LCnebZnysmI'," +
				"'Smoke on the Water','Child in Time','Burn');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0043','https://www.youtube.com/watch?v=594WLzzb3JI'," +
				"'https://www.youtube.com/watch?v=PdLIerfXuZ4'," +
				"'https://www.youtube.com/watch?v=BfuWXRZe9yA'," +
				"'My Generation','Who Are You','Behind Blue Eyes');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0044','https://www.youtube.com/watch?v=l482T0yNkeo'," +
				"'https://www.youtube.com/watch?v=pAgnJDJN4VA'," +
				"'https://www.youtube.com/watch?v=v2AC41dglnM'," +
				"'Highway to hell','Back in Black','Thunderstruck');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0045','https://www.youtube.com/watch?v=eQSGw0hMd_I'," +
				"'https://www.youtube.com/watch?v=3a7cHPy04s8'," +
				"'https://www.youtube.com/watch?v=u6d8eKvegLI'," +
				"'Jumpin Jack Flash','(I can´t get no) Satisfaction','Paint it black');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0046','https://www.youtube.com/watch?v=N_MqfF0WBsU'," +
				"'https://www.youtube.com/watch?v=QA5gJ0hZpCc'," +
				"'https://www.youtube.com/watch?v=h2svmUcsKeg'," +
				"'Waterloo sunset','Dedicated follower of fashion','Days');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0047','https://www.youtube.com/watch?v=DpkDdLZGg30'," +
				"'https://www.youtube.com/watch?v=5RQCzKE0tws'," +
				"'https://www.youtube.com/watch?v=TLV4_xaYynY'," +
				"'Hey Joe','Voodoo child','All along the watchtower');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0048','https://www.youtube.com/watch?v=8SbUC-UaAxE'," +
				"'https://www.youtube.com/watch?v=o1tj2zJ2Wvg'," +
				"'https://www.youtube.com/watch?v=zRIbf6JqkNc'," +
				"'November Rain','Welcome to the Jungle','Don´t Cry');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0049','https://www.youtube.com/watch?v=nU5uDozoSSM'," +
				"'https://www.youtube.com/watch?v=GTFaOxLlJCA'," +
				"'https://www.youtube.com/watch?v=zYZrlyyyvBo'," +
				"'Summertime Blues','Peace Of Mind','The Hunter');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0050','https://www.youtube.com/watch?v=eDdI7GhZSQA'," +
				"'https://www.youtube.com/watch?v=2WQAl5nJWHs'," +
				"'https://www.youtube.com/watch?v=ajCYQL8ouqw'," +
				"'Hey Jude','Yesterday','Let it Be');");
		
		//BLUES
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0051','https://www.youtube.com/watch?v=BXsusJ787sU'," +
				"'https://www.youtube.com/watch?v=HJrZ1LAOLYQ'," +
				"'https://www.youtube.com/watch?v=Zi7Pn7ouTRY'," +
				"'The Thrill Is Gone','Why I Sing The Blues','Heartbreaker');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0052','https://www.youtube.com/watch?v=0WUdlaLWSVM'," +
				"'https://www.youtube.com/watch?v=mLDDxfFKd9Y'," +
				"'https://www.youtube.com/watch?v=Fx_cU7aTtWA'," +
				"'Layla','Motherless Children','Get Ready');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0053','https://www.youtube.com/watch?v=G4pp02_GN9A&list=RDG4pp02_GN9A'," +
				"'https://www.youtube.com/watch?v=X70VMrH3yBg&list=RDG4pp02_GN9A&index=3'," +
				"'https://www.youtube.com/watch?v=9oz66xHeaaM&list=RDX70VMrH3yBg&index=2'," +
				"'Boogie Chillen','Boom Boom','Blues Before Sunrise');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0054','https://www.youtube.com/watch?v=l5IcyBEvXRQ'," +
				"'https://www.youtube.com/watch?v=mpaPBCBjSVc'," +
				"'https://www.youtube.com/watch?v=a_426RiwST8'," +
				"'Set You Free ','Tighten Up','Lonely Boy');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0055','https://www.youtube.com/watch?v=U5QKpsVzndc'," +
				"'https://www.youtube.com/watch?v=-SBmury81Ws'," +
				"'https://www.youtube.com/watch?v=x8LesTvNuaw'," +
				"'Hoochie Coochie Man','Got My Mojo Working','Mannish Boy');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0056','https://www.youtube.com/watch?v=arARV4BVsPM'," +
				"'https://www.youtube.com/watch?v=1WviS11PGoA'," +
				"'https://www.youtube.com/watch?v=n_4UmAY852I'," +
				"'This is the end','Fever','Five Long Years');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0057','https://www.youtube.com/watch?v=AjuvyJV5Qtc'," +
				"'https://www.youtube.com/watch?v=oeqZSKYCowA'," +
				"'https://www.youtube.com/watch?v=iAalXasuMrY'," +
				"'Leaving Blues','Walking Round In Circles','Mr. Charlie');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0058','https://www.youtube.com/watch?v=ohZYDZmo7hQ&list=AL94UKMTqg-9Ct-1n2jPS_WG5gMIVk-KdN&index=8'," +
				"'https://www.youtube.com/watch?v=nFvaC0GqV0c&list=AL94UKMTqg-9Ct-1n2jPS_WG5gMIVk-KdN&index=5'," +
				"'https://www.youtube.com/watch?v=8_DNf-Zu600&list=AL94UKMTqg-9Ct-1n2jPS_WG5gMIVk-KdN&index=4'," +
				"'Red House','As The Years Go Passing By','Born Under A Bad Sign');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0059','https://www.youtube.com/watch?v=lO8blq8i3L4&list=AL94UKMTqg-9AlfnhrYLtIIl-zcboxfLTn&index=1'," +
				"'https://www.youtube.com/watch?v=yPjxqM18Vo8&list=AL94UKMTqg-9AlfnhrYLtIIl-zcboxfLTn&index=4'," +
				"'https://www.youtube.com/watch?v=nJcWSjMbmPI&list=AL94UKMTqg-9AlfnhrYLtIIl-zcboxfLTn&index=6'," +
				"'Down in Mississippi','I Ain´t Got You ','When I Woke up This Morning');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0060','https://www.youtube.com/watch?v=dle4hxjVyGU'," +
				"'https://www.youtube.com/watch?v=O8WzDO_hj8A'," +
				"'https://www.youtube.com/watch?v=uVPYR9UFsTU'," +
				"'Blues For Mama','Magnolia','Carry on');");
		
		//JAZZ
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0061','https://www.youtube.com/watch?v=egY8rUpxqcE'," +
				"'https://www.youtube.com/watch?v=6YjIsUc4Ank'," +
				"'https://www.youtube.com/watch?v=hlSbSKNk9f0'," +
				"'My Way','New York New York','Strangers in the night');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0062','https://www.youtube.com/watch?v=WA5__PilSMs'," +
				"'https://www.youtube.com/watch?v=el9cknEVlc0'," +
				"'https://www.youtube.com/watch?v=ZBseZ6y7hDQ'," +
				"'Norah Jones','I´ve Got to See You Again','What Am I to You?');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0063','https://www.youtube.com/watch?v=zqNTltOGh5c'," +
				"'https://www.youtube.com/watch?v=PoPL7BExSQU'," +
				"'https://www.youtube.com/watch?v=IX1MvO7Z5QY'," +
				"'So What','Blue In Green','Sanctuary / Spanish Key');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0064','https://www.youtube.com/watch?v=QH3Fx41Jpl4'," +
				"'https://www.youtube.com/watch?v=cO6trkI47s8'," +
				"'https://www.youtube.com/watch?v=tq5A0YadWKs'," +
				"'Sinnerman','Images','I Loves You Porgy');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0065','https://www.youtube.com/watch?v=_qt435yF2Qg'," +
				"'https://www.youtube.com/watch?v=he9g6lMgi8E'," +
				"'https://www.youtube.com/watch?v=30FTr6G53VU'," +
				"'A Love Supreme','Blue Train','Giant Steps');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0066','https://www.youtube.com/watch?v=fk6JtDhA7WI'," +
				"'https://www.youtube.com/watch?v=qVCgf6_M7i4'," +
				"'https://www.youtube.com/watch?v=-PI_SverY0w'," +
				"'California Dreaming','Fly me to the moon','Crazy');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0067','https://www.youtube.com/watch?v=Web007rzSOI'," +
				"'https://www.youtube.com/watch?v=IbKXuluS1HM'," +
				"'https://www.youtube.com/watch?v=uzJMTSaAl8g'," +
				"'Strange Fruit','Love me or Leave me','The Man I Love');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0068','https://www.youtube.com/watch?v=Cgy9v9wee3Q'," +
				"'https://www.youtube.com/watch?v=1fzZ4l2H5-w'," +
				"'https://www.youtube.com/watch?v=mshV7ug8cdE'," +
				"'Solitude','Bewitched, Bothered, and Bewildered','These foolish things');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0069','https://www.youtube.com/watch?v=j9al6-pjNhY'," +
				"'https://www.youtube.com/watch?v=ifxRuzo5cuA'," +
				"'https://www.youtube.com/watch?v=jvXywhJpOKs'," +
				"'Oh, You Crazy Moon','Broken Wing','My Funny Valentine');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0070','https://www.youtube.com/watch?v=6Xwl4oVnbhU'," +
				"'https://www.youtube.com/watch?v=rN-JDZO7TyA'," +
				"'https://www.youtube.com/watch?v=AIPGyKGuWeA'," +
				"'Something´s Gotta Give','Oh Lonesome Me','The Candy Man');");
		
		//PUNK NACIONAL
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0071','https://www.youtube.com/watch?v=5a7asJ81X9c'," +
				"'https://www.youtube.com/watch?v=JgVYI3aKyKI'," +
				"'https://www.youtube.com/watch?v=XrNOoLiTMjE'," +
				"'Venganza','Salve','Ellos Dicen Mierda');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0072','https://www.youtube.com/watch?v=l7XrKzb1hXc'," +
				"'https://www.youtube.com/watch?v=3h6lU6BcwQM'," +
				"'https://www.youtube.com/watch?v=TIO3oBPyp6w'," +
				"'Historia Triste','Mucha Policia','Maldito Pais');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0073','https://www.youtube.com/watch?v=4B-Een4r0_8'," +
				"'https://www.youtube.com/watch?v=J5WMU2ygxyY'," +
				"'https://www.youtube.com/watch?v=wrIKb5hAFys'," +
				"'Inadaptados','Enemigo Publico','La 204');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0074','https://www.youtube.com/watch?v=3YBc-SxiDJ4'," +
				"'https://www.youtube.com/watch?v=FEjGsDFlXzY'," +
				"'https://www.youtube.com/watch?v=Ycg4ynVwh_g'," +
				"'Adios Lili Marlen','Antisocial','Suicidate');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0075','https://www.youtube.com/watch?v=jycq870apec'," +
				"'https://www.youtube.com/watch?v=gAaCQ465oVc&index=5&list=RDjycq870apec'," +
				"'https://www.youtube.com/watch?v=sgnBynkhfCQ&index=7&list=RDjycq870apec'," +
				"'Enamorado De La Muerte','Revolución','Odio A Mi atria');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0076','https://www.youtube.com/watch?v=ZZBmBAe2G8g'," +
				"'https://www.youtube.com/watch?v=rNyrHOeuRwY'," +
				"'https://www.youtube.com/watch?v=2FUS6lrPxh4'," +
				"'Me Gusta Ser Una Zorra','Sexo Por La Cara','Yo Les Mando A La Mierda');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0077','https://www.youtube.com/watch?v=Web007rzSOI'," +
				"'https://www.youtube.com/watch?v=IbKXuluS1HM'," +
				"'https://www.youtube.com/watch?v=uzJMTSaAl8g'," +
				"'Asesino A Sueldo','Puta Cerda','Me Cago En Dios');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0078','https://www.youtube.com/watch?v=Ewozq0CbX6g'," +
				"'https://www.youtube.com/watch?v=CH8z-jlxZZw'," +
				"'https://www.youtube.com/watch?v=_Qww77PwsFI'," +
				"'Antimilitar','Aqui No Hay Nadie','Represion');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0079','https://www.youtube.com/watch?v=BVznRLHevJ8'," +
				"'https://www.youtube.com/watch?v=VxN4b761NtY'," +
				"'https://www.youtube.com/watch?v=oqs3R4UYZsE'," +
				"'Anarkia','Revolucion','Kualkier dia');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0080','https://www.youtube.com/watch?v=fO-MZSVJkoY'," +
				"'https://www.youtube.com/watch?v=3us3ba5UyfE'," +
				"'https://www.youtube.com/watch?v=mq3tFxMuUG4'," +
				"'Altrabuces Y Consuegras','Soñe... y Lucho Por Ella','Food And Bombs');");
		
		//SOUL
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0081','https://www.youtube.com/watch?v=gq_OUJ0xwoU'," +
				"'https://www.youtube.com/watch?v=lPABeKfHNak'," +
				"'https://www.youtube.com/watch?v=v4ecggLaj1Y'," +
				"'When I Fall in Love','Wonderful World','The Lonesome Road');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0082','https://www.youtube.com/watch?v=ZKvhxapM5zo'," +
				"'https://www.youtube.com/watch?v=Mrd14PxaUco'," +
				"'https://www.youtube.com/watch?v=r_7iRVtxui8'," +
				"'Hit The Road Jack','I Got a Woman','I Can´t Stop Loving You');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0083','https://www.youtube.com/watch?v=JOD-M7WZkZQ'," +
				"'https://www.youtube.com/watch?v=H77fRz1rybs'," +
				"'https://www.youtube.com/watch?v=LJ9CLOEOB5U'," +
				"'Sex Machine','It´s A Man´s Man´s Man´s World','Super Bad');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0084','https://www.youtube.com/watch?v=hsL9UL9qbv8'," +
				"'https://www.youtube.com/watch?v=6FOUqQt3Kg0'," +
				"'https://www.youtube.com/watch?v=m0dlKBZ6ry0'," +
				"'Think','Respect','I Will Survive');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0085','https://www.youtube.com/watch?v=N7kvabf8Oy8'," +
				"'https://www.youtube.com/watch?v=3wZ_b_uUAdQ'," +
				"'https://www.youtube.com/watch?v=X00XdLhFLSg'," +
				"'Superstition','You are the sunshine of my life','Higher Ground');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0086','https://www.youtube.com/watch?v=COiIC3A0ROM'," +
				"'https://www.youtube.com/watch?v=ICKToz7BLLA'," +
				"'https://www.youtube.com/watch?v=hsU6_eSG4k4'," +
				"'Lets Stay Together','Tired Of Being Alone','Love and Happiness');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0087','https://www.youtube.com/watch?v=5KFYUJ63nk8'," +
				"'https://www.youtube.com/watch?v=jbRiM26hyms'," +
				"'https://www.youtube.com/watch?v=3mz_EXHKGHs'," +
				"'In The Midnight Hour','Land of a Thousand Dances','Land of 1000 Dances');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0088','https://www.youtube.com/watch?v=Xz-UvQYAmbg'," +
				"'https://www.youtube.com/watch?v=BKPoHgKcqag'," +
				"'https://www.youtube.com/watch?v=H-kA3UtBj4M'," +
				"'Ain´t no Mountain High Enough','Lets Get It On','What´s Going On');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0089','https://www.youtube.com/watch?v=d_EADBnXjXc'," +
				"'https://www.youtube.com/watch?v=Ms97mz3H69E'," +
				"'https://www.youtube.com/watch?v=rylbj33b8qA'," +
				"'Valerie','Amy, Amy, Amy','Monkey Man');");
		db.execSQL("INSERT INTO Enlaces (Id_enlace,Enlace1,Enlace2,Enlace3,Nombre1,Nombre2,Nombre3) VALUES"+
				"('0090','https://www.youtube.com/watch?v=Ju8Hr50Ckwk'," +
				"'https://www.youtube.com/watch?v=g4IiccUjGps'," +
				"'https://www.youtube.com/watch?v=Urdlvw0SSEc'," +
				"'If I ain´t got you','Empire State of Mind','Falling');");
		
		
		//CREACION TABLA ARTISTAS:
		db.execSQL("CREATE TABLE IF NOT EXISTS Artistas ("+
				"_id INTEGER PRIMARY KEY AUTOINCREMENT,"+
				"Nombre VARCHAR NOT NULL UNIQUE,"+
				"Nivel INTEGER  NOT NULL,"+
				"Estilo VARCHAR NOT NULL,"+
				"Enlaces CHAR(4)," +
				"FOREIGN KEY (Enlaces) REFERENCES Enlaces(Id_enlace));");

		
		//ROCK AND ROLL
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Elvis "+
				"Presley','1','R&R','0001');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Bill "+
				"Haley','1','R&R','0002');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Chuck "+
				"Berry','1','R&R','0003');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Litte "+
				"Richard','1','R&R','0004');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Jerry Lee "+
				"Lewis','1','R&R','0005');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Fats "+
				"Domino','2','R&R','0006');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Lloyd "+
				"Price','2','R&R','0007');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Johnny "+
				"Cash','2','R&R','0008');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Larry "+
				"Williams','2','R&R','0009');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('The "+
				"Crickets','3','R&R','0010');");	
		
		//POP
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES "+
				"('Michel Jackson','1','Pop','0011');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Madonna',"+
				"'1','Pop','0012');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('The Jackson "+
				"5','1','Pop','0013');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Janet "+
				"Jackson','1','Pop','0014');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Kylie "+
				"Minogue','2','Pop','0015');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Christina "+
				"Aguilera','2','Pop','0016');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES "+
				"('Cyndi Lauper','1','Pop','0017');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Britney "+
				"Spears','3','Pop','0018');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Lady "+
				"Gaga','3','Pop','0019');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Katy "+
				"Perry','3','Pop','0020');");
		
		//RAP
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Snoop "+
				"Dogg','1','Rap','0021');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('LL Cool "+
				"J.','1','Rap','0022');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Ice "+
				"T','1','Rap','0023');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES "+
				"('2pac','2','Rap','0024');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Ice "+
				"Cube','2','Rap','0025');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Cypress "+
				"Hill','1','Rap','0026');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Public "+
				"Enemy','2','Rap','0027');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Dr. "+
				"Dre','3','Rap','0028');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Eminem', "+
				"'3','Rap','0029');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('D12',"+
				"'3','Rap','0030');");
		
		//HEAVY METAL
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Black "+
				"Sabbath','1','Heavy Metal','0031');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Judas "+
				"Priest','1','Heavy Metal','0032');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Iron "+
				"Maiden','1','Heavy Metal','0033');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES "+
				"('Motörhead','2','Heavy Metal','0034');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Megadeth',"+
				"'2','Heavy Metal','0035');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Anthrax',"+
				"'2','Heavy Metal','0036');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Slayer',"+
				"'2','Heavy Metal','0037');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Metallica',"+
				"'3','Heavy Metal','0038');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Pantera', "+
				"'3','Heavy Metal','0039');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Sepultura',"+
				"'3','Heavy Metal','0040');");
		
		//HARD ROCK
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Led "+
				"Zeppelin','1','Hard Rock','0041');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Deep "+
				"Purple','1','Hard Rock','0042');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('The "+
				"Who','2','Hard Rock','0043');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES "+
				"('AC/DC','3','Hard Rock','0044');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('The Rolling Stones',"+
				"'2','Hard Rock','0045');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('The Kinks',"+
				"'3','Hard Rock','0046');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('The Jimmi Hendrix Experience',"+
				"'1','Hard Rock','0047');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Guns & Roses',"+
				"'2','Hard Rock','0048');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Blue Cheer', "+
				"'4','Hard Rock','0049');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('The Beatles',"+
				"'3','Hard Rock','0050');");
		
		//BLUES
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('B.B. "+
				"King','1','Blues','0051');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Eric "+
				"Clapton','1','Blues','0052');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('John Lee "+
				"Hooker','1','Blues','0053');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES "+
				"('The Black Keys','3','Blues','0054');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Muddy Waters',"+
				"'1','Blues','0055');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Buddy Guy',"+
				"'2','Blues','0056');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Lightning Hopkins',"+
				"'2','Blues','0057');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Albert King',"+
				"'2','Blues','0058');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Jimmy Reed', "+
				"'2','Blues','0059');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('J.J. Cale',"+
				"'2','Blues','0060');");
		
		//JAZZ
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Frank "+
				"Sinatra','1','Jazz','0061');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Norah "+
				"Jones','3','Jazz','0062');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Miles "+
				"Davis','2','Jazz','0063');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES "+
				"('Nina Simone','2','Jazz','0064');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('John Coltrane',"+
				"'2','Jazz','0065');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Diana Krall',"+
				"'3','Jazz','0066');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Billie Holiday',"+
				"'2','Jazz','0067');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Ella Fitzgerald',"+
				"'1','Jazz','0068');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Chet Baker', "+
				"'2','Jazz','0069');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Sammy Davis Jr.',"+
				"'1','Jazz','0070');");
		
		//PUNK NACIONAL
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('La Polla "+
				"Records','1','Punk Nacional','0071');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Escorbuto',"+
				"'1','Punk Nacional','0072');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Cicatriz',"+
				"'2','Punk Nacional','0073');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES "+
				"('Interterror','1','Punk Nacional','0074');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('R.I.P',"+
				"'1','Punk Nacional','0075');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Vulpess',"+
				"'1','Punk Nacional','0076');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('MCD',"+
				"'1','Punk Nacional','0077');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Basura',"+
				"'1','Punk Nacional','0078');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Piperrak', "+
				"'2','Punk Nacional','0079');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Asto Pituak',"+
				"'3','Punk Nacional','0080');");
		
		//SOUL
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Sam "+
				"Cooke','1','Soul','0081');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Ray Charles',"+
				"'1','Soul','0082');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('James Brown',"+
				"'1','Soul','0083');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES "+
				"('Aretha Franklin','1','Soul','0084');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Stevie Wonder',"+
				"'1','Soul','0085');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Al Green',"+
				"'2','Soul','0086');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Wilson Pickett',"+
				"'2','Soul','0087');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Marvin Gaye',"+
				"'2','Soul','0088');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Amy Winehouse', "+
				"'3','Soul','0089');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Alicia Keys',"+
				"'3','Soul','0090');");
		
/*		//REGGAE
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('The "+
				"Wailers','1','Reggae','0091');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Ray Charles',"+
				"'1','Reggae','0092');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('James Brown',"+
				"'1','Reggae','0093');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES "+
				"('Aretha Franklin','1','Reggae','0094');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Stevie Wonder',"+
				"'1','Reggae','0095');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Al Green',"+
				"'2','Reggae','0096');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Wilson Pickett',"+
				"'2','Reggae','0097');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Marvin Gaye',"+
				"'2','Reggae','0098');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Amy Winehouse', "+
				"'3','Reggae','0099');");
		db.execSQL("INSERT INTO Artistas (Nombre,Nivel,Estilo,Enlaces) VALUES ('Alicia Keys',"+
				"'3','Reggae','0100');");*/
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
