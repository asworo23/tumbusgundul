package com.app.tumbasin.connection.callbacks;

import com.app.tumbasin.model.NewsInfo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tri Asworo MS on 3/31/2017.
 */

public class CallbackHargaDisperindag implements Serializable {

    public String status = "";
    public int count = -1;
    public int count_total = -1;
    public int pages = -1;
    public List<NewsInfo> news_infos = new ArrayList<>();
}
