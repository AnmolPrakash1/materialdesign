package in.co.codewithmike.activity;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.github.chrisbanes.photoview.PhotoView;

import in.co.codewithmike.R;

public class ImageAdapter extends PagerAdapter {
    Context mContext;
    private int[] sliderImageId = new int[]{
            R.drawable.photo_female_1, R.drawable.photo_female_8, R.drawable.photo_singer_male, R.drawable.photo_male_1, R.drawable.photo_male_5,
    };

    ImageAdapter(Context context) {
        this.mContext = context;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((ImageView) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        //ImageView imageView = new ImageView(mContext);

        PhotoView photoView = new PhotoView(container.getContext());

/*
        Glide.with(getContext())
                .load(UriFromFile(new File(imageList.get(position))))
                .asBitmap()
                .thumbnail(0.2f)
                .into(photoView);
        photoView.setMaximumScale(5.0F);
       photoView.setMediumScale(3.0F);
        container.addView(photoView, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

           return photoView;
*/


        photoView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        photoView.setImageResource(sliderImageId[position]);
        ((ViewPager) container).addView(photoView, 0);
        return photoView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((PhotoView) object);
    }

    @Override
    public int getCount() {
        return sliderImageId.length;
    }
}