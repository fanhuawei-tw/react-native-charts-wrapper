package com.github.wuxudong.rncharts.charts;

import com.github.mikephil.charting.formatter.ValueFormatter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yangdong on 01/31/2018.
 * Update by 卡哇伊Phoebe
 */

public class DateSinceFormatter extends ValueFormatter {
    private DateFormat mFormat;
    private long mStartingTimestamp;

    public DateSinceFormatter(String pattern, long startingTimestamp) {
        mFormat = new SimpleDateFormat(pattern);
        mStartingTimestamp = startingTimestamp;
    }

    public String getFormattedValue(float value) {
        return mFormat.format(new Date((long) value + mStartingTimestamp));
    }
}
