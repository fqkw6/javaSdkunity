package com.ZhuoYue.unityToSDK;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.unity3d.player.UnityPlayer;
import com.unity3d.player.UnityPlayerActivity;
public class MainActivity extends UnityPlayerActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);  //ע�͵�
	}
//////------------
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
//////------------
	
	
	public static void InvokeUnity()
	{
		UnityPlayer.UnitySendMessage("Canvas", "JavaCallUnity2", "invokep");
	
	}
	///go Ϊunity�ű��ҵ���������methodΪ������  ��Ϊunity�������
	public static void Invokep(String go,String method)
	{
		UnityPlayer.UnitySendMessage(go, method, "invokep");
	
	}
	///��׿����unity
	public static int Invokepp(String go,String method)
	{
		UnityPlayer.UnitySendMessage(go, method, "invokepp");
		return 12555;
	
	}
	///unity ���÷Ǿ�̬
	
	public  int PrintName3(int str) {
		return str;
	}
	public static  int PrintName2(int str) {
		return str;
	}
	///unity ���þ�̬����
	public static  String PrintName() {
		InvokeUnity();
		return "NishiwaBa";
	}
	
	
}
