package space.hfreni.choosatron;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class IslandAdventure extends Activity {

    private Button mOptA;
    private Button mOptB;
    private Button mOptC;
    private TextView mHeader;
    private TextView mBody;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_island_adventure);
    }

    /*
     * 95% Sure we Don't need this shit.
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_island_adventure, menu);
        return true;
    }


    /*
     * 95% Sure we Don't need this shit.
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
