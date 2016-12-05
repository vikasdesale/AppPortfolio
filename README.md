# AppPortfolio
***
This is android project for familirize with android application development.

####1.Style for group of resources
####2.Rounded Corner Buttons 
####3.CardView 
####4.CircularImageView Library

***   
##OUTPUT SCREEN OF APPLICATION
![alt tag](https://github.com/vikasdesale/AppPortfolio/blob/master/Screenshots/screena1.png)
![alt tag](https://github.com/vikasdesale/AppPortfolio/blob/master/Screenshots/screena2.png)

***
####Style for group of resources:-
writing styles for resources like group of buttons we can reduce the codes.
```
   <style name="MyButton" parent="android:Widget.Button">
      <item name="android:layout_height">40dp</item>
      <item name="android:layout_width">220dp</item>
      <item name="android:textSize">12dp</item>
      <item name="android:layout_centerHorizontal">true</item>
      <item name="android:textColor">#000000</item>/>
      <item name="android:layout_marginTop">15dp</item>
   </style>
```
***

####Rounded Corner Buttons:-
create new resource file in drawable directory as selector.we can change the color on various button events.
```
   <item android:state_focused="true">
       <shape android:shape="rectangle">
          <solid android:color="#33eefF" />
          <corners android:radius="5dp" />
       </shape>
    </item>
```
***

####CardView:-
Like ListView we can divide screen in multiple cards.
```
   <android.support.v7.widget.CardView
       android:id="@+id/card1"
       android:layout_width="match_parent"
       android:layout_height="wrap_content"
       android:layout_margin="20dp">.....................
   </android.support.v7.widget.CardView>
```
***

####CircularImageView Library:-
Custom view for circular images in Android while maintaining the best draw performance
https://github.com/Pkmmte/CircularImageView
***



                                                                                        
