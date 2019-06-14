package in.ac.sharda.productlistactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;
import in.ac.sharda.loginactivity.MainActivity;
import in.ac.sharda.loginactivity.R;
import in.ac.sharda.productdetail.ProductDetailActivity;

public class ProductListActivity extends AppCompatActivity {
    ListView lst;
    int[] images = {R.drawable.pine,R.drawable.straw,R.drawable.black,R.drawable.white,R.drawable.choco,R.drawable.butter,R.drawable.kitkat,
            R.drawable.ferrero,R.drawable.red,R.drawable.fondant};
    String[] names = {"Pineapple Cake","Strawberry Cake","Black Forest Cake","White Forest Cake","Choco Truffle Cake","Butterscotch Cake",
            "Kit Kat Cake","Ferrero Rocher Cake",
            "Red Velvet Cake","Fondant + Cream Cake"};
    String[] desc = {"Pineapple Cake – seriously moist, homemade pineapple cake made from scratch with pineapple juice and bits and a kiss of lemon. So easy to make and you’ll love it with or without the vanilla frosting!",
            "Strawberry cake is a cake that uses strawberry as a primary ingredient. Strawberries may be used in the cake batter, atop cakes and in a strawberry cake's frosting",
            "Black Forest cake has multiple (usually 4) layers of chocolate sponge cake, cherries, and whipped cream.",
            "This impressive spin on a Black Forest cake uses sweet white chocolate instead of dark chocolate",
            "Chocolate Truffle Cake. Getting reviews... An edible masterpiece of chocolate, with a subtle orange flavor, this cake is the perfect finale to a very special dinner.",
            "This Butterscotch Cake is a moist, from-scratch brown sugar cake topped with butterscotch buttercream made with melted butterscotch chips!",
            "Kit Kat Cake is a chocolate frosted chocolate layer cake, surrounded by over 40 Kit Kat bars, topped with 2 large bags of M&M's.",
            "Ferrero Rocher Cake is made of Hazelnut Sponge Cake layers, then sandwiched with Nutella Buttercream and some wafers for the crunch. The cake looks and tastes like the most amazing Hazelnut Truffle!",
            "Red velvet cake is traditionally a red, red-brown, cherry flavored, crimson or scarlet colored chocolate layer cake, layered with white cream cheese or ermine icing",
            "Fondant. Fondant is made from a mix of glucose, sugar and gelatin. It forms in a dough shape that can be rolled out and laid over cakes and other desserts."};
    String[] price ={"Price ₹280","Price ₹330","Price ₹330","Price ₹350","Price ₹380","Price ₹330","Price ₹500","Price ₹550","Price ₹550","Price ₹500"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);

        lst=(ListView)findViewById(R.id.lst);

        CustomAdapter customAdapter = new CustomAdapter();
        lst.setAdapter(customAdapter);

    }
    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup parent) {
            view = getLayoutInflater().inflate(R.layout.coustomlayout,null);

            ImageView imageView = (ImageView)view.findViewById(R.id.merg);
            TextView textView_name = (TextView)view.findViewById(R.id.mg);
            TextView textView_desc = (TextView)view.findViewById(R.id.mgdes);
            TextView text_price = (TextView)view.findViewById(R.id.price);

            imageView.setImageResource(images[i]);
            textView_name.setText(names[i]);
            textView_desc.setText(desc[i]);
            text_price.setText(price[i]);

            return view;
        }

    }
}