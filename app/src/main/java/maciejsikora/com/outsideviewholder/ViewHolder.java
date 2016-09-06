package maciejsikora.com.outsideviewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import maciejsikora.com.outsideviewholder.R;

/**
 * Simple ViewHolder standard class
 * Created by maciej on 06.09.16.
 */
public class ViewHolder extends RecyclerView.ViewHolder {

    private final TextView textField;

    public ViewHolder(View itemView) {
        super(itemView);


        this.textField=(TextView)itemView.findViewById(R.id.textField);
    }

    /**
     * Set value in our textview
     * @param text
     */
    public void setText(String text){

        this.textField.setText(text);
    }

}
