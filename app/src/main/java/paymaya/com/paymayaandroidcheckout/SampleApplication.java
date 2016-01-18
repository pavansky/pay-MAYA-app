package paymaya.com.paymayaandroidcheckout;

import android.app.Application;

import com.paymaya.sdk.android.PayMayaConfig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import paymaya.com.paymayaandroidcheckout.models.Product;
import paymaya.com.paymayaandroidcheckout.utils.ListItem;

/**
 * Created by jadeantolingaa on 1/6/16.
 */
public class SampleApplication extends Application {
    private static final int CONFIG_ENVIRONMENT = PayMayaConfig.ENVIRONMENT_SANDBOX;

    private List<Product> mProductList = new ArrayList<>();
    private HashMap<Integer, Integer> mHashMap = new HashMap<Integer, Integer>();

    @Override
    public void onCreate() {
        super.onCreate();
        PayMayaConfig.setEnvironment(CONFIG_ENVIRONMENT);
        mProductList = ListItem.getItemModels();
    }

    public List<Product> getProductList() {
        return mProductList;
    }

    public HashMap<Integer, Integer> getHashMap() {
        return mHashMap;
    }

    public void setHashMap(HashMap<Integer, Integer> hashMap) {
        mHashMap = hashMap;
    }
}
