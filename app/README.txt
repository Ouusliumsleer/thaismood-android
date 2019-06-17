# Thai-s-mood-server
Thais Mood server พัฒนาบน NodeJS + ExpressJS 
โดยจะแบ่งเป็น 4 ไฟล์ (services) ด้วยกันคือ 
1. member-server.js (/member/*)
  ในไฟล์นี้จะเป็น APIs ที่เกี่ยวข้องกับการจัดการข้อมูลสมาชิกทั้งหมด รันอยู่บน port 4553
2. record-server.js (/record/*)
  ในไฟล์นี้จะเป็น APIs ที่เกี่ยวข้องกับการจัดการข้อมูลอารมณ์ การนอน ไดอารี รันอยู่บน port 5553
3. evaluation-server.js (/evaluation/*)
  ในไฟล์นี้จะเป็น APIs ที่เกี่ยวข้องกับการจัดการข้อมูลการทำแบบประเมิน รันอยู่บน port 6553
4. researcher-server.js (/more/*)
  ในไฟล์นี้จะเป็น APIs ที่เกี่ยวข้องกับฟังค์ชันอื่นๆ รันอยู่บน port7553
  
## สิ่งที่ต้องเตรียมก่อน deploy server
1. ติดตั้ง [NodeJS](https://nodejs.org/en/download/) 
2. ติดตั้ง [ExpressJS](https://expressjs.com/en/starter/installing.html)

## การรัน deploy server
1. ถ้าหากมีโฟลเดอร์ node_modules อยู่ให้ทำการลบออกก่อน
2. ให้ออกคำสั่ง npm install ภายตั้ง Directory Thais Mood server
```bash
npm install
```
3. ในการรันแต่ละ service ให้ manual run แต่ละไฟล์ดังนี้

3.1 /member
```bash
    node member-server.js
```
3.2 /record
```bash
    node record-server.js
```
3.3 /evaluation
```bash
    node evaluation-server.js
```
3.4 /researcher
```bash
    node researcher-server.js
```
    
##เพิ่มเติม
เนื่องจากตอนพัฒนาผู้พัฒนาใช้ nginx เป็นตัวรับ Request แล้วกระจายไปยัง services ต่างๆ ทั้งนี้ตัว service สามารถใช้งานได้เลยหากเรียกผ่าน port


โครงสร้างโฟลเดอร์ thaismood-android-master
--------------------------------------------------------------------------
```
thaismood-android
├── .idea
│   ├── encoding.xml
│   ├── gradle.xml
│   ├── misc.xml
│   ├── runConfigurations.xml
│   └── vcs.xml
├── app
│   ├── debug
│   │   ├── app-debug.apk
│   │   └── output.json
│   ├── libs
│   │   └── MPAndroidChart-v3.0.1.jar
│   ├── src
│   │   ├── androidTest
│   │   │     └── java
│   │   │           └── com
│   │   │                └── nnspace
│   │   │                       └── thaismoodandroid
│   │   │                                 └── ExampleInstrumentedTest.java
│   │   ├── main
│   │   │     ├── java
│   │   │     │     └── com
│   │   │     │          └── nnspace
│   │   │     │                  └── thaismoodandroid
│   │   │     │                                   ├── Database
│   │   │     │                           	  │	     └── ThaisMoodDB.java
│   │   │     │                                   ├── DatabaseModel
│   │   │     │                           	  │	     ├── ActivityModel.java
│   │   │     │                           	  │	     ├── EmotionModel.java
│   │   │     │                           	  │	     ├── EvaluationModel.java
│   │   │     │                           	  │	     ├── ExerciseModel.java
│   │   │     │                           	  │	     ├── LogonModel.java
│   │   │     │                           	  │	     ├── NoteModel.java
│   │   │     │                           	  │	     ├── ProfileGeneralModel.java
│   │   │     │                           	  │	     ├── ProfilePatientModel.java
│   │   │     │                           	  │	     └── SleepModel.java
│   │   │     │                                   ├── EvaluationActivity
│   │   │     │                           	  │	     ├── Evaluation.java
│   │   │     │                           	  │	     ├── EvaluationResultFragment.java
│   │   │     │                           	  │	     ├── IEvaluation.java
│   │   │     │                           	  │	     ├── Q2QuestionFragment.java
│   │   │     │                           	  │	     ├── Q8QustionFragment.java
│   │   │     │                           	  │	     ├── Q9QuetionFragment.java
│   │   │     │                           	  │	     └── QMDQFragment.java
│   │   │     │                                   ├── EvaluationHistory
│   │   │     │                           	  │	     ├── EvaluationHistoryActivity.java
│   │   │     │                           	  │	     ├── EvaluationListAdapter.java
│   │   │     │                           	  │	     └── EvaluationObject.java
│   │   │     │                                   ├── HomeActivity
│   │   │     │                           	  │	     ├── Add
│   │   │     │                           	  │	     │    ├── AddActivityFragment.java
│   │   │     │                           	  │	     │    ├── AddMoodActivity.java
│   │   │     │                           	  │	     │    └── AddSleepActivity.java
│   │   │     │                           	  │	     ├── Diary
│   │   │     │                           	  │	     │    ├── DiaryListAdapter.java
│   │   │     │                           	  │	     │    ├── DiaryObject.java
│   │   │     │                           	  │	     │    ├── FragmentDiary.java
│   │   │     │                           	  │	     │    └── WriteNoteActivity.java
│   │   │     │                           	  │	     ├── Graph
│   │   │     │                           	  │	     │    ├── FragmentGraph.java
│   │   │     │                           	  │	     │    ├── GraphMonth.java
│   │   │     │                           	  │	     │    ├── GraphWeek.java
│   │   │     │                           	  │	     │    └── GraphYear.java
│   │   │     │                           	  │	     ├── List
│   │   │     │                           	  │	     │    ├── ActivityObject.java
│   │   │     │                           	  │	     │    ├── FragmentList.java
│   │   │     │                           	  │	     │    ├── MoodListAdaptor.java
│   │   │     │                           	  │	     │    ├── MoodObject.java
│   │   │     │                           	  │	     │    ├── RecordListAdapter.java
│   │   │     │                           	  │	     │    ├── RecordObject.java
│   │   │     │                           	  │	     │    ├── SleepListAdapter.java
│   │   │     │                           	  │	     │    └── SleepObject.java
│   │   │     │                           	  │	     ├── FragmentEmergencyData.java
│   │   │     │                           	  │	     ├── Home2.java
│   │   │     │                           	  │	     └── IndexFragment.java
│   │   │     │                                   ├── RegisterActivity
│   │   │     │                           	  │	     ├── Register_ask_sex.java
│   │   │     │                           	  │	     ├── Register_ask_type.java
│   │   │     │                           	  │	     ├── Register_form.java
│   │   │     │                           	  │	     └── Register.java
│   │   │     │                                   ├── AboutActivity.java
│   │   │     │                                   ├── CheckBipolar.java
│   │   │     │                                   ├── CheckDepress.java
│   │   │     │                                   ├── EmergencyContactActivity.java
│   │   │     │                                   ├── FindHospitalActivity.java
│   │   │     │                                   ├── FragmentEditProfie.java
│   │   │     │                                   ├── FragmentUtil.java
│   │   │     │                                   ├── FragmentViewProfile.java
│   │   │     │                                   ├── GetTemporaryCredential.java
│   │   │     │                                   ├── JWTUtils.java
│   │   │     │                                   ├── MainActivity.java
│   │   │     │                                   ├── MainmenuTest.java
│   │   │     │                                   ├── MoodType.java
│   │   │     │                                   ├── MyCalender.java
│   │   │     │                                   ├── NotificationReceiver.java
│   │   │     │                                   ├── ProfileActivity.java
│   │   │     │                                   ├── Record.java
│   │   │     │                                   ├── SettingActivity.java
│   │   │     │                                   ├── ShowDialog.java
│   │   │     │                                   ├── SignInOn.java
│   │   │     │                                   └── SlideInAnimationHandler.java
│   │   │     │                                               ├── SwipeDetector.java
│   │   │     │                                               ├── SynActivity.java
│   │   │     │                                               ├── VerifyEmailActivity.java
│   │   │     │                                               └── ViewType.java
│   │   │     ├── res
│   │   │     │      ├── drawable
│   │   │     │      │         ├── icon
│   │   │     │      │         │       ├── about.svg
│   │   │     │      │         │       ├── add_activity.svg
│   │   │     │      │         │       ├── add_excercise.svg
│   │   │     │      │         │       ├── add_mood.svg
│   │   │     │      │         │       ├── add_sleep.svg
│   │   │     │      │         │       ├── call.svg
│   │   │     │      │         │       ├── checked.svg
│   │   │     │      │         │       ├── diary.svg
│   │   │     │      │         │       ├── diary.svg
│   │   │     │      │         │       ├── evaluation.svg
│   │   │     │      │         │       ├── eye.svg
│   │   │     │      │         │       ├── file.svg
│   │   │     │      │         │       ├── fliter.svg
│   │   │     │      │         │       ├── help.svg
│   │   │     │      │         │       ├── home.svg
│   │   │     │      │         │       ├── hospital.svg
│   │   │     │      │         │       ├── iconfinder_115_List_183241.svg
│   │   │     │      │         │       ├── iconfinder_graph_298791.svg
│   │   │     │      │         │       ├── iconfinder_paper_226568.svg
│   │   │     │      │         │       ├── iconfinder_plus-24_103172.svg
│   │   │     │      │         │       ├── iconfinder_profile_ecommerce_shop_4177554.svg
│   │   │     │      │         │       ├── left.svg
│   │   │     │      │         │       ├── line-graph.svg
│   │   │     │      │         │       ├── logout.svg
│   │   │     │      │         │       ├── mail_f.svg
│   │   │     │      │         │       ├──mail.svg
│   │   │     │      │         │       ├── mail_t.svg
│   │   │     │      │         │       ├── more.svg
│   │   │     │      │         │       ├── otp.svg
│   │   │     │      │         │       ├── pencil.svg
│   │   │     │      │         │       ├── profile.svg
│   │   │     │      │         │       ├── right.svg
│   │   │     │      │         │       └── save.svg
│   │   │     │      │         ├── awaken.png
│   │   │     │      │         ├── bg.png
│   │   │     │      │         ├── birthday.png
│   │   │     │      │         ├── black_levels0.png
│   │   │     │      │         ├── black_levels1.png
│   │   │     │      │         ├── black_levels2.png
│   │   │     │      │         ├── black_levels3.png
│   │   │     │      │         ├── box_border_2q.xml
│   │   │     │      │         ├── box_border_8q.xml
│   │   │     │      │         ├── box_border_9q.xml
│   │   │     │      │         ├── box_border_mdq.xml
│   │   │     │      │         ├── box_border.xml
│   │   │     │      │         ├── btn_circle.xml
│   │   │     │      │         ├── button_border_unselected.xml
│   │   │     │      │         ├── button_border.xml
│   │   │     │      │         ├── buttonstyle.xml
│   │   │     │      │         ├── caffeine.png
│   │   │     │      │         ├── calendar.png
│   │   │     │      │         ├── checked.png
│   │   │     │      │         ├── cigarette.png
│   │   │     │      │         ├── circle_2q_band.xml
│   │   │     │      │         ├── circle_8q_band.xml
│   │   │     │      │         ├── circle_9q_band.xml
│   │   │     │      │         ├── circle_mdq_band.xml
│   │   │     │      │         ├── correct.png
│   │   │     │      │         ├── dialog_border.xml
│   │   │     │      │         ├── dmhlogo.png
│   │   │     │      │         ├── edittext1.xml
│   │   │     │      │         ├── edittext_onfocus.xml
│   │   │     │      │         ├── emergency_contact.png
│   │   │     │      │         ├── emo_green_blank.png
│   │   │     │      │         ├── emo_green_fill.png
│   │   │     │      │         ├── emo_grey_blank.png
│   │   │     │      │         ├── emo_grey_fill.png
│   │   │     │      │         ├── emo_red_blank.png
│   │   │     │      │         ├── emo_red_fill.png
│   │   │     │      │         ├── emo_violet_blank.png
│   │   │     │      │         ├── emo_violet_fill.png
│   │   │     │      │         ├── emo_yellow_blank.png
│   │   │     │      │         ├── emo_yellow_fill.png
│   │   │     │      │         ├── excercise.png
│   │   │     │      │         ├── filter.png
│   │   │     │      │         ├── gradientbackground.xml
│   │   │     │      │         ├── graph.xml
│   │   │     │      │         ├── header_bg.jpg
│   │   │     │      │         ├── height.png
│   │   │     │      │         ├── home_bg.png
│   │   │     │      │         ├── ic_about.xml
│   │   │     │      │         ├── ic_add_activity.xml
│   │   │     │      │         ├── ic_add_excercise.xml
│   │   │     │      │         ├── ic_add_mood.xml
│   │   │     │      │         ├── ic_add_sleep.xml
│   │   │     │      │         ├── ic_android_black_24dp.xml
│   │   │     │      │         ├── ic_call.xml
│   │   │     │      │         ├── ic_checked.xml
│   │   │     │      │         ├── ic_dashboard_black_24dp.xml
│   │   │     │      │         ├── ic_details.xml
│   │   │     │      │         ├── ic_diary.xml
│   │   │     │      │         ├── ic_down.xml
│   │   │     │      │         ├── ic_error.xml
│   │   │     │      │         ├── ic_evaluation.xml
│   │   │     │      │         ├── ic_eye.xml
│   │   │     │      │         ├── ic_fliter_im_web.png
│   │   │     │      │         ├── ic_fliter
│   │   │     │      │         ├── ic_help.xml
│   │   │     │      │         ├── ic_home_black_24dp.xml
│   │   │     │      │         ├── ic_home.xml
│   │   │     │      │         ├── ic_hospital.xml
│   │   │     │      │         ├── ic_launcher_background.xml
│   │   │     │      │         ├── ic_launcher_foreground.xml
│   │   │     │      │         ├── ic_left.xml
│   │   │     │      │         ├── ic_line_graph.xml
│   │   │     │      │         ├── ic_logout.xml
│   │   │     │      │         ├── ic_mail_24dp.xml
│   │   │     │      │         ├── ic_month_im_web.png
│   │   │     │      │         ├── ic_months.png
│   │   │     │      │         ├── ic_more.xml
│   │   │     │      │         ├── ic_notifications_black_24dp.xml
│   │   │     │      │         ├── ic_otp.xml
│   │   │     │      │         ├── ic_pencil.xml
│   │   │     │      │         ├── ic_profile.xml
│   │   │     │      │         ├── ic_right.xml
│   │   │     │      │         ├── ic_save.xml
│   │   │     │      │         ├── ic_settings.xml
│   │   │     │      │         ├── ic_week_im_web.png
│   │   │     │      │         ├── ic_week.png
│   │   │     │      │         ├── ic_year_im_web.png
│   │   │     │      │         ├── ic_year.png
│   │   │     │      │         ├── im_female_foreground.xml
│   │   │     │      │         ├── im_female_web.png
│   │   │     │      │         ├── im_general_foreground.xml
│   │   │     │      │         ├── im_general_web.png
│   │   │     │      │         ├── im_male_foreground.xml
│   │   │     │      │         ├── im_male_web.png
│   │   │     │      │         ├── im_patient_foreground.xml
│   │   │     │      │         ├── im_patient_web.png
│   │   │     │      │         ├── layout_shadow.xml
│   │   │     │      │         ├── list.xml
│   │   │     │      │         ├── mood_box_green.xml
│   │   │     │      │         ├── mood_box_grey.xml
│   │   │     │      │         ├── mood_box_red.xml
│   │   │     │      │         ├── mood_box_violet.xml
│   │   │     │      │         ├── mood_box.xml
│   │   │     │      │         ├── mood_box_yellow.xml
│   │   │     │      │         ├── next.png
│   │   │     │      │         ├── night_sky.png
│   │   │     │      │         ├── one_grey.png
│   │   │     │      │         ├── one_red.png
│   │   │     │      │         ├── one_violet.png
│   │   │     │      │         ├── one_yellow.png
│   │   │     │      │         ├── otp_box_border.xml
│   │   │     │      │         ├── paper.xml
│   │   │     │      │         ├── plus.xml
│   │   │     │      │         ├── pragnent.png
│   │   │     │      │         ├── previous.png
│   │   │     │      │         ├── profile.xml
│   │   │     │      │         ├── q_2q_choice_selected.xml
│   │   │     │      │         ├── q_2q_choice_unselected.xml
│   │   │     │      │         ├── q_2q_result_box.xml
│   │   │     │      │         ├── q_8q_choice_selected.xml
│   │   │     │      │         ├── q_8q_choice_unselected.xml
│   │   │     │      │         ├── q_8q_result_box.xml
│   │   │     │      │         ├── q_9q_choice_selected.xml
│   │   │     │      │         ├── q_9q_choice_unselected.xml
│   │   │     │      │         ├── q_9q_result_box.xml
│   │   │     │      │         ├── q_mdq_choice_selected.xml
│   │   │     │      │         ├── q_mdq_choice_unselected.xml
│   │   │     │      │         ├── q_mdq_result_box.xml
│   │   │     │      │         ├── relationflip_logo.png
│   │   │     │      │         ├── samaritan.png
│   │   │     │      │         ├── seek_bg_green.xml
│   │   │     │      │         ├── seek_bg_grey.xml
│   │   │     │      │         ├── seek_bg_red.xml
│   │   │     │      │         ├── seek_bg_violet.xml
│   │   │     │      │         ├── seek_bg_yellow.xml
│   │   │     │      │         ├── sleeping.png
│   │   │     │      │         ├── sleep.png
│   │   │     │      │         ├── splash_bg.png
│   │   │     │      │         ├── thaismood_logo_demo.png
│   │   │     │      │         ├── thaismood_logo.png
│   │   │     │      │         ├── three_grey.png
│   │   │     │      │         ├── three_red.png
│   │   │     │      │         ├── three_violer.png
│   │   │     │      │         ├── three_yellow.png
│   │   │     │      │         ├── thumb_green.xml
│   │   │     │      │         ├── two_grey.png
│   │   │     │      │         ├── two_red.png
│   │   │     │      │         ├── two_violet.png
│   │   │     │      │         ├── two_yellow.png
│   │   │     │      │         ├── username.png
│   │   │     │      │         ├── user.png
│   │   │     │      │         ├── warning.png
│   │   │     │      │         ├── weight.png
│   │   │     │      │         └── wrong.png
│   │   │     │      ├── drawable-v24
│   │   │     │      │         └── ic_launcher_foreground.xml
│   │   │     │      ├── font
│   │   │     │      │     ├── fonts.xml
│   │   │     │      │     ├── thsarabunnew_bolditalic.ttf
│   │   │     │      │     ├── thsarabunnew_bold.ttf
│   │   │     │      │     ├── thsarabunnew_italic.ttf
│   │   │     │      │     └── thsarabunnew.ttf
│   │   │     │      ├── layout
│   │   │     │      │         ├── fragment
│   │   │     │      │         │       ├── drawable
│   │   │     │      │         │       │	├── ic_menu_camera.xml
│   │   │     │      │         │       │	├── ic_menu_gallery.xml
│   │   │     │      │         │       │	├── ic_menu_manage.xml
│   │   │     │      │         │       │	├── ic_menu_send.xml
│   │   │     │      │         │       │	├── ic_menu_share.xml
│   │   │     │      │         │       │	├── ic_menu_slideshow.xml
│   │   │     │      │         │       │	└── side_nav_bar.xml
│   │   │     │      │         │       ├── layout
│   │   │     │      │         │       │	├── activity_about.xml
│   │   │     │      │         │       │	├── activity_add_mood.xml
│   │   │     │      │         │       │	├── activity_add_sleep.xml
│   │   │     │      │         │       │	├── activity_app_intro.xml
│   │   │     │      │         │       │	├── activity_emergency_help.xml
│   │   │     │      │         │       │	├── activity_evaluation_history.xml
│   │   │     │      │         │       │	├── activity_evaluation.xml
│   │   │     │      │         │       │	├── activity_find_hospital.xml
│   │   │     │      │         │       │	├── activity_get_temporary_credential.xml
│   │   │     │      │         │       │	├── activity_home2.xml
│   │   │     │      │         │       │	├── activity_profile.xml
│   │   │     │      │         │       │	├── activity_setting.xml
│   │   │     │      │         │       │	├── activity_syn.xml
│   │   │     │      │         │       │	├── activity_write_note.xml
│   │   │     │      │         │       │	├── app_bar_home2.xml
│   │   │     │      │         │       │	├── content_home2.xml
│   │   │     │      │         │       │	├── dialog_8q_warning.xml
│   │   │     │      │         │       │	├── dialog_bipolar_warning.xml
│   │   │     │      │         │       │	├── dialog_depress_warning.xml
│   │   │     │      │         │       │	├── dialog_mood_details.xml
│   │   │     │      │         │       │	├── dialog_view_mood.xml
│   │   │     │      │         │       │	├── dialog_view_record.xml
│   │   │     │      │         │       │	├── dialog_view_sleep.xml
│   │   │     │      │         │       │	├── fragment_add_activity.xml
│   │   │     │      │         │       │	├── fragment_diary.xml
│   │   │     │      │         │       │	├── fragment_edit_profie.xml
│   │   │     │      │         │       │	├── fragment_emergency_data.xml
│   │   │     │      │         │       │	├── fragment_evaluation_result.xml
│   │   │     │      │         │       │	├── fragment_graph_month.xml
│   │   │     │      │         │       │	├── fragment_graph_week.xml
│   │   │     │      │         │       │	├── fragment_graph.xml
│   │   │     │      │         │       │	├── fragment_graph_year.xml
│   │   │     │      │         │       │	├── fragment_index.xml
│   │   │     │      │         │       │	├── fragment_list.xml
│   │   │     │      │         │       │	├── fragment_q2_question.xml
│   │   │     │      │         │       │	├── fragment_q8_qustion.xml
│   │   │     │      │         │       │	├── fragment_q9_quetion.xml
│   │   │     │      │         │       │	├── fragment_qmdq.xml
│   │   │     │      │         │       │	├── fragment_register_ask_sex.xml
│   │   │     │      │         │       │	├── fragment_register_ask_type.xml
│   │   │     │      │         │       │	├── fragment_register_form.xml
│   │   │     │      │         │       │	├── fragment_tab_activity.xml
│   │   │     │      │         │       │	├── fragment_view_profile.xml
│   │   │     │      │         │       │	├── list_diary.xml
│   │   │     │      │         │       │	├── list_evaluation.xml
│   │   │     │      │         │       │	├── list_mood.xml
│   │   │     │      │         │       │	├── main.xml
│   │   │     │      │         │       │	└── nav_header_home2.xml
│   │   │     │      │         │       ├── values
│   │   │     │      │         │       │	├── dimens.xml
│   │   │     │      │         │       │	├── strings.xml
│   │   │     │      │         │       │	└── styles.xml
│   │   │     │      │         │       ├── values-v21
│   │   │     │      │         │       │	└── styles.xml
│   │   │     │      │         │       ├── values-w820dp
│   │   │     │      │         │       │	└── dimens.xml
│   │   │     │      │         │       └── xml
│   │   │     │      │         │       	└── more_option.xml
│   │   │     │      │         ├── activity_mainmenu_test.xml
│   │   │     │      │         ├── activity_main.xml
│   │   │     │      │         ├── activity_mdq.xml
│   │   │     │      │         ├── activity_otp.xml
│   │   │     │      │         ├── activity_register.xml
│   │   │     │      │         ├── activity_sign_in_on.xml
│   │   │     │      │         ├── dialog_login.xml
│   │   │     │      │         ├── dialog_pateint_alert.xml
│   │   │     │      │         ├── dialog_register.xml
│   │   │     │      │         ├── list_record_list.xml
│   │   │     │      │         └── list_sleep_time.xml
│   │   │     │      ├── menu
│   │   │     │      │     ├── activity_home2_drawer.xml
│   │   │     │      │     ├── list_view_menu.xml
│   │   │     │      │     ├── listview_mnu.xml
│   │   │     │      │     └── navigation.xml
│   │   │     │      ├── mipmap-anydpi-v26
│   │   │     │      │         ├── ic_fliter_im_round.xml
│   │   │     │      │         ├── ic_fliter_im.xml
│   │   │     │      │         ├── ic_launcher_round.xml
│   │   │     │      │         ├── ic_launcher.xml
│   │   │     │      │         ├── ic_month_im.xml
│   │   │     │      │         ├── ic_month_im_round.xml
│   │   │     │      │         ├── ic_week_im.xml
│   │   │     │      │         ├── ic_week_im_round.xml
│   │   │     │      │         ├── ic_year_im.xml
│   │   │     │      │         ├── ic_year_im_round.xml
│   │   │     │      │         ├── im_female.xml
│   │   │     │      │         ├── im_female_round.xml
│   │   │     │      │         ├── im_general.xml
│   │   │     │      │         ├── im_general_round.xml
│   │   │     │      │         ├── im_male.xml
│   │   │     │      │         ├── im_male_round.xml
│   │   │     │      │         ├── im_patient.xml
│   │   │     │      │         └── im_patient_round.xml
│   │   │     │      ├── mipmap-hdpi
│   │   │     │      │         ├── ic_fliter_im.png
│   │   │     │      │         ├── ic_fliter_im_round.png
│   │   │     │      │         ├── ic_launcher.png
│   │   │     │      │         ├── ic_launcher_round.png
│   │   │     │      │         ├── ic_month_im.png
│   │   │     │      │         ├── ic_month_im_round.png
│   │   │     │      │         ├── ic_month.png
│   │   │     │      │         ├── ic_week_im.png
│   │   │     │      │         ├── ic_week_im_round.png
│   │   │     │      │         ├── ic_week.png
│   │   │     │      │         ├── ic_year_im.png
│   │   │     │      │         ├── ic_year_im_round.png
│   │   │     │      │         ├── ic_year.png
│   │   │     │      │         ├── im_female.png
│   │   │     │      │         ├── im_female_round.png
│   │   │     │      │         ├── im_general.png
│   │   │     │      │         ├── im_general_round.png
│   │   │     │      │         ├── im_male.png
│   │   │     │      │         ├── im_male_round.png
│   │   │     │      │         ├── im_patient.png
│   │   │     │      │         └── im_patient_round.png
│   │   │     │      ├── mipmap-mdpi
│   │   │     │      │         ├── ic_fliter_im.png
│   │   │     │      │         ├── ic_fliter_im_round.png
│   │   │     │      │         ├── ic_launcher.png
│   │   │     │      │         ├── ic_launcher_round.png
│   │   │     │      │         ├── ic_month_im.png
│   │   │     │      │         ├── ic_month_im_round.png
│   │   │     │      │         ├── ic_month.png
│   │   │     │      │         ├── ic_week_im.png
│   │   │     │      │         ├── ic_week_im_round.png
│   │   │     │      │         ├── ic_week.png
│   │   │     │      │         ├── ic_year_im.png
│   │   │     │      │         ├── ic_year_im_round.png
│   │   │     │      │         ├── ic_year.png
│   │   │     │      │         ├── im_female.png
│   │   │     │      │         ├── im_female_round.png
│   │   │     │      │         ├── im_general.png
│   │   │     │      │         ├── im_general_round.png
│   │   │     │      │         ├── im_male.png
│   │   │     │      │         ├── im_male_round.png
│   │   │     │      │         ├── im_patient.png
│   │   │     │      │         └── im_patient_round.png
│   │   │     │      ├── mipmap-xhdpi
│   │   │     │      │         ├── ic_fliter_im.png
│   │   │     │      │         ├── ic_fliter_im_round.png
│   │   │     │      │         ├── ic_launcher.png
│   │   │     │      │         ├── ic_launcher_round.png
│   │   │     │      │         ├── ic_month_im.png
│   │   │     │      │         ├── ic_month_im_round.png
│   │   │     │      │         ├── ic_month.png
│   │   │     │      │         ├── ic_week_im.png
│   │   │     │      │         ├── ic_week_im_round.png
│   │   │     │      │         ├── ic_week.png
│   │   │     │      │         ├── ic_year_im.png
│   │   │     │      │         ├── ic_year_im_round.png
│   │   │     │      │         ├── ic_year.png
│   │   │     │      │         ├── im_female.png
│   │   │     │      │         ├── im_female_round.png
│   │   │     │      │         ├── im_general.png
│   │   │     │      │         ├── im_general_round.png
│   │   │     │      │         ├── im_male.png
│   │   │     │      │         ├── im_male_round.png
│   │   │     │      │         ├── im_patient.png
│   │   │     │      │         └── im_patient_round.png
│   │   │     │      ├── mipmap-xxhdpi
│   │   │     │      │         ├── ic_fliter_im.png
│   │   │     │      │         ├── ic_fliter_im_round.png
│   │   │     │      │         ├── ic_launcher.png
│   │   │     │      │         ├── ic_launcher_round.png
│   │   │     │      │         ├── ic_month_im.png
│   │   │     │      │         ├── ic_month_im_round.png
│   │   │     │      │         ├── ic_month.png
│   │   │     │      │         ├── ic_week_im.png
│   │   │     │      │         ├── ic_week_im_round.png
│   │   │     │      │         ├── ic_week.png
│   │   │     │      │         ├── ic_year_im.png
│   │   │     │      │         ├── ic_year_im_round.png
│   │   │     │      │         ├── ic_year.png
│   │   │     │      │         ├── im_female.png
│   │   │     │      │         ├── im_female_round.png
│   │   │     │      │         ├── im_general.png
│   │   │     │      │         ├── im_general_round.png
│   │   │     │      │         ├── im_male.png
│   │   │     │      │         ├── im_male_round.png
│   │   │     │      │         ├── im_patient.png
│   │   │     │      │         └── im_patient_round.png
│   │   │     │      ├── mipmap-xxxhdpi
│   │   │     │      │         ├── ic_fliter_im.png
│   │   │     │      │         ├── ic_fliter_im_round.png
│   │   │     │      │         ├── ic_launcher.png
│   │   │     │      │         ├── ic_launcher_round.png
│   │   │     │      │         ├── ic_month_im.png
│   │   │     │      │         ├── ic_month_im_round.png
│   │   │     │      │         ├── ic_month.png
│   │   │     │      │         ├── ic_week_im.png
│   │   │     │      │         ├── ic_week_im_round.png
│   │   │     │      │         ├── ic_week.png
│   │   │     │      │         ├── ic_year_im.png
│   │   │     │      │         ├── ic_year_im_round.png
│   │   │     │      │         ├── ic_year.png
│   │   │     │      │         ├── im_female.png
│   │   │     │      │         ├── im_female_round.png
│   │   │     │      │         ├── im_general.png
│   │   │     │      │         ├── im_general_round.png
│   │   │     │      │         ├── im_male.png
│   │   │     │      │         ├── im_male_round.png
│   │   │     │      │         ├── im_patient.png
│   │   │     │      │         └── im_patient_round.png
│   │   │     │      ├── transition
│   │   │     │      │         ├── fade.xml
│   │   │     │      │         └── fadex.xml
│   │   │     │      └── values
│   │   │     │                ├── colors.xml
│   │   │     │                ├── dimens.xml
│   │   │     │                ├── strings.xml
│   │   │     │                └── styles.xml
│   │   │     └── AndroidManifest.xml
│   │   └── test
│   │        └── java
│   │                 └── com
│   │                      └── nnspace
│   │                             └── thaismoodandroid
│   │                                          └── ExampleUnitTest.java
│   ├── .gitignore
│   ├── build.gradle
│   └── proguard-rules.pro
├── gradle
│   └── wrapper
│            ├── gradle-wrapper.jar
│            └── gradle-wrapper.properties
├── .gitignore
├── build.gradle
├── git
├── gradle.properties
├── gradlew
├── gradlew.bat
└── settings.gradle

```


