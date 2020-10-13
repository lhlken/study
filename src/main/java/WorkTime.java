import com.alibaba.fastjson.JSON;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class WorkTime {

    public static void main(String[] args) {

        String str = "{\"Success\":true,\"Message\":\"\\u003cspan\\u003e【2019-08-05至2019-08-09，已出勤工时 \\u003cspan style = \\u0027color:#ff7800;font-weight:bold;\\u0027\\u003e55\\u003c/span\\u003e 小时 \\u003cspan style = \\u0027color:#ff7800;font-weight:bold;\\u0027\\u003e24\\u003c/span\\u003e 分钟，距离满勤还有 \\u003cspan style = \\u0027color:#ff7800;font-weight:bold;\\u0027\\u003e0\\u003c/span\\u003e 小时 】\\u003c/span\\u003e\",\"Code\":3,\"Total\":0,\"ReturnValue\":[{\"Day\":\"\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":null,\"Today\":false},{\"Day\":\"1日\",\"CreditCardData\":\"09:19-09:19-09:21-12:24-19:24-19:57-19:57-19:57-19:57\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时37分钟\",\"Today\":false},{\"Day\":\"2日\",\"CreditCardData\":\"09:17-09:17-13:38-13:39-13:49-16:30-16:31-18:02-18:03-18:33-19:56-19:56-19:56-19:57-19:57\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时40分钟\",\"Today\":false},{\"Day\":\"3日\",\"CreditCardData\":\"09:29-09:29-09:29-09:30-12:09-18:24-19:55-19:56-19:56-19:56-19:56-19:56-19:57-19:57-19:57-19:57-19:58-19:58-19:58-19:58-19:58-19:58-19:58-19:59-19:59-19:59-19:59-19:59-19:59-20:00-20:00-20:00-20:00-20:00-20:00-20:00-20:00-20:00-20:01-20:01\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时31分钟\",\"Today\":false},{\"Day\":\"4日\",\"CreditCardData\":\"09:18-09:18-09:18-09:20-12:04-18:33-19:30-19:55-19:55-19:55-19:56\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时37分钟\",\"Today\":false},{\"Day\":\"5日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"年假：09:00-18:00\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：9小时\",\"Today\":false},{\"Day\":\"6日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"7日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"8日\",\"CreditCardData\":\"09:26-09:26-09:27-09:28-12:25-18:29-18:31-21:00-21:05-21:11-21:14-21:16\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：11小时49分钟\",\"Today\":false},{\"Day\":\"9日\",\"CreditCardData\":\"08:39-08:39-08:41-09:22-09:24-13:06-13:19-19:58\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：11小时19分钟\",\"Today\":false},{\"Day\":\"10日\",\"CreditCardData\":\"09:17-09:17-09:17-09:18-12:16-18:23-19:58-19:59\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时42分钟\",\"Today\":false},{\"Day\":\"11日\",\"CreditCardData\":\"10:20-10:20-10:21-14:55-18:13-18:14-21:38-21:44-21:44-21:45\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：11小时25分钟\",\"Today\":false},{\"Day\":\"12日\",\"CreditCardData\":\"10:04-10:05-12:53-13:06-18:32-18:53-18:55\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：8小时51分钟\",\"Today\":false},{\"Day\":\"13日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"14日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"15日\",\"CreditCardData\":\"09:25-09:25-12:19-18:22-19:54-19:54-19:55-19:56-19:56-19:56-19:56-19:56-19:56-19:56-19:59-19:59-19:59-20:00-20:00-20:00-20:00-20:01-20:01\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时36分钟\",\"Today\":false},{\"Day\":\"16日\",\"CreditCardData\":\"08:34-08:34-08:35-13:04-13:05-15:28-17:45-20:50-21:00-21:24-21:25\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：12小时51分钟\",\"Today\":false},{\"Day\":\"17日\",\"CreditCardData\":\"09:21-09:21-09:23-12:19-18:04-18:04-18:04-18:06-18:07-18:07-18:07-18:07-18:07-18:07-18:08-18:08-18:08-18:08-18:08-18:08-18:09-18:09-18:09\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：8小时48分钟\",\"Today\":false},{\"Day\":\"18日\",\"CreditCardData\":\"08:17-08:17-08:17-08:19-11:06-12:42-17:44-21:59\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：13小时42分钟\",\"Today\":false},{\"Day\":\"19日\",\"CreditCardData\":\"09:14-09:15-19:53-19:53-19:56\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时42分钟\",\"Today\":false},{\"Day\":\"20日\",\"CreditCardData\":\"09:03-09:03-09:05-18:31-19:53-21:29-21:33-21:34-21:34-21:35-21:35\",\"OvertimeData\":\"计薪：09:03-21:35计11.50小时\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"21日\",\"CreditCardData\":\"08:31-08:31-08:33-15:45-15:46-21:30-22:16-22:16-22:17\",\"OvertimeData\":\"计薪：08:31-22:17计12.50小时\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"22日\",\"CreditCardData\":\"09:57-09:57-12:22-18:07-20:10-20:44-21:05-21:06-21:06-21:06-21:07-21:09-21:10-21:11-21:11-21:11-21:11\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：11小时13分钟\",\"Today\":false},{\"Day\":\"23日\",\"CreditCardData\":\"09:32-09:32-09:33-09:53-10:00-12:07-17:10-18:08-19:21-19:25-19:25-19:26-19:26-19:26-19:28-19:28-19:28-19:28-19:28-19:28-19:28-19:30-19:30-19:30-19:30-19:30-19:30-19:31\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：15小时24分钟\",\"Today\":false},{\"Day\":\"24日\",\"CreditCardData\":\"00:54-00:54-00:55-00:55-00:55-00:55-00:55-00:55-00:55-00:56-00:56-09:37-09:37-13:07-21:39-21:39\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：12小时1分钟\",\"Today\":false},{\"Day\":\"25日\",\"CreditCardData\":\"11:12-11:13-12:05-18:27-18:43-21:12-21:12-21:14\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时1分钟\",\"Today\":false},{\"Day\":\"26日\",\"CreditCardData\":\"09:37-09:38-12:03-18:36-18:38\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：9小时1分钟\",\"Today\":false},{\"Day\":\"27日\",\"CreditCardData\":\"08:56-12:38-12:40-13:03-20:49-20:49-20:56-21:04-21:05-21:09\",\"OvertimeData\":\"计薪：08:56-21:09计11.00小时\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"28日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"29日\",\"CreditCardData\":\"09:32-09:32-21:09-21:09-21:13\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：11小时40分钟\",\"Today\":false},{\"Day\":\"30日\",\"CreditCardData\":\"09:33-09:33-09:34-12:18-18:22-21:33-21:35\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：12小时1分钟\",\"Today\":false},{\"Day\":\"31日\",\"CreditCardData\":\"09:31-09:31-09:33-10:26-13:17-18:42-19:52-19:52-19:52-19:53\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时22分钟\",\"Today\":false},{\"Day\":\"\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false}]}";
        str = "{\"Success\":true,\"Message\":\"\\u003cspan\\u003e【2020-01-13至2020-01-19，已出勤工时 \\u003cspan style = \\u0027color:#ff7800;font-weight:bold;\\u0027\\u003e30\\u003c/span\\u003e 小时 \\u003cspan style = \\u0027color:#ff7800;font-weight:bold;\\u0027\\u003e48\\u003c/span\\u003e 分钟，距离满勤还有 \\u003cspan style = \\u0027color:#ff7800;font-weight:bold;\\u0027\\u003e23\\u003c/span\\u003e 小时\\u003cspan style = \\u0027color:#ff7800;font-weight:bold;\\u0027\\u003e12\\u003c/span\\u003e 分钟】\\u003c/span\\u003e\",\"Code\":3,\"Total\":0,\"ReturnValue\":[{\"Day\":\"\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":null,\"Today\":false},{\"Day\":\"\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":null,\"Today\":false},{\"Day\":\"\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":null,\"Today\":false},{\"Day\":\"1日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"2日\",\"CreditCardData\":\"09:33-09:34-09:34-09:35-11:53-12:47-17:53-19:57-19:57-20:00-20:01-20:02\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时28分钟\",\"Today\":false},{\"Day\":\"3日\",\"CreditCardData\":\"09:33-09:33-09:33-09:34-11:57-17:55-21:47-21:48-21:49\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：12小时16分钟\",\"Today\":false},{\"Day\":\"4日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"5日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"6日\",\"CreditCardData\":\"09:55-09:56-12:04-14:12-18:09-18:17-19:55-19:57-19:59-19:59-19:59-19:59-20:00-20:01-20:02\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时7分钟\",\"Today\":false},{\"Day\":\"7日\",\"CreditCardData\":\"09:32-09:32-09:32-09:32-09:33-09:33-12:46-19:55-19:57-19:59-19:59-20:00-20:00-20:01-20:02-20:03\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时31分钟\",\"Today\":false},{\"Day\":\"8日\",\"CreditCardData\":\"09:31-09:31-09:33-09:34-11:57-18:30-19:36\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：16小时54分钟\",\"Today\":false},{\"Day\":\"9日\",\"CreditCardData\":\"02:24-02:25-07:23-08:07-11:56-14:14-19:27-19:29-19:30-19:31\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：12小时7分钟\",\"Today\":false},{\"Day\":\"10日\",\"CreditCardData\":\"09:59-09:59-10:00-10:00-10:00-10:01-11:53-18:45-18:56-18:57-18:59-19:00-19:00-19:01-19:01\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：9小时1分钟\",\"Today\":false},{\"Day\":\"11日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"12日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"13日\",\"CreditCardData\":\"09:37-09:38-09:39-11:58-12:28-12:32-14:00-19:27-19:28-19:29-19:29-19:29-19:29-19:30-19:31-19:32\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：9小时55分钟\",\"Today\":false},{\"Day\":\"14日\",\"CreditCardData\":\"09:33-09:34-17:41-18:07-19:26-19:26-19:27-19:30-19:31-19:32\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：9小时58分钟\",\"Today\":false},{\"Day\":\"15日\",\"CreditCardData\":\"08:38-08:38-08:38-08:39-08:56-18:06-19:27-19:27-19:29-19:29-19:31-19:31-19:32\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"出勤工时：10小时54分钟\",\"Today\":false},{\"Day\":\"16日\",\"CreditCardData\":\"09:32-09:33-09:34-09:34-11:56-14:38-15:58\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":true},{\"Day\":\"17日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"18日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"19日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"20日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"21日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"22日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"23日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"24日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"25日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"26日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"27日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"28日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"29日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"30日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"31日\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false},{\"Day\":\"\",\"CreditCardData\":\"\",\"OvertimeData\":\"\",\"AttendanceData\":\"\",\"LeaveTheData\":\"\",\"TravelTheData\":\"\",\"AttendancelType\":\"\",\"WorkingSystemText\":null,\"AccountingWork\":\"\",\"Today\":false}]}";

        int year = 2020;
        int month = 1 - 1;
        int leaveDay = 0;
        double everyDay = 10.6;
        JsonRootBean bean = JSON.parseObject(str,JsonRootBean.class);

        List<ReturnValue> list = bean.getReturnValue();

        int hour = 0;
        int minute = 0;
        int day = 0;

        int allDay = 0;
        for(ReturnValue value : list) {
            if(value.getDay() == null || "".equals(value.getDay().trim())) {
                continue;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.set(year,month,Integer.parseInt(value.getDay().trim().replace("日","")));

            //排除不需要工作的周末
            int week = calendar.get(Calendar.DAY_OF_WEEK);
            if((week == 1 || week == 7) && "".equals(value.getAccountingWork())) {
                continue;
            }

            //排除请假
            if(!"".equals(value.getLeaveTheData())) {
                continue;
            }

            //排除工作日的节假日
            String toDay = new SimpleDateFormat("dd").format(new Date());
            if(("".equals(value.getAccountingWork()) && Integer.parseInt(toDay)> calendar.get(Calendar.DAY_OF_MONTH))) {
                continue;
            }
//            System.out.println("应出勤日："+value.getDay()+calendar.get(Calendar.DAY_OF_MONTH));

            allDay++;
            //排除未到天
            if( "".equals(value.getAccountingWork())) {
                continue;
            }
            day++;
            String workingTime = value.getAccountingWork();

            workingTime = workingTime.replace("出勤工时：","");
            workingTime = workingTime.replace("分钟","");
            String[] time = workingTime.split("小时");

            hour += Integer.parseInt(time[0]);
            minute += time.length > 1 ? Integer.parseInt(time[1]) : 0;
        }

        int minuteNow = minute%60;
        int hourNow = minute/60;
        hourNow += hour;

        double perEveryDay = hourNow*1./day+minuteNow*1./60/day;
        double perEveryDayWithToday = (hourNow+7)*1./(day+1)+(minuteNow+0)*1./60/(day+1);

        allDay  = 16;

        System.out.println("月份"+year+"年"+(month+1)+"月");
        System.out.println("已工作平均工时："+perEveryDay);
//        System.out.println("已工作平均工时含当天："+perEveryDayWithToday);
        System.out.println("已工作天数："+day);
        System.out.println("已工作小时数："+hour+"====已工作分钟数:"+minute);
        System.out.println("合计后已工作小时数:"+hourNow+"=====合计后已工作分钟数:"+minuteNow);
        System.out.println("总的需工作天数:"+allDay+"=====总的需要工作小时数:"+(allDay * everyDay));
        System.out.println("还需小时数："+ ((allDay * everyDay * 60)- hour * 60 - minute)/60 );
        System.out.println("还需工作天数："+(allDay-day-leaveDay)+"=====请假天数:"+leaveDay);
        System.out.println("剩余工作日需工作天数："+(((allDay-leaveDay) * everyDay * 60)- hour * 60 - minute)/60/(allDay-day-leaveDay));
    }
}

class ReturnValue {

    private String Day;
    private String CreditCardData;
    private String OvertimeData;
    private String AttendanceData;
    private String LeaveTheData;
    private String TravelTheData;
    private String AttendancelType;
    private String WorkingSystemText;
    private String AccountingWork;
    private boolean Today;
    public void setDay(String Day) {
        this.Day = Day;
    }
    public String getDay() {
        return Day;
    }

    public void setCreditCardData(String CreditCardData) {
        this.CreditCardData = CreditCardData;
    }
    public String getCreditCardData() {
        return CreditCardData;
    }

    public void setOvertimeData(String OvertimeData) {
        this.OvertimeData = OvertimeData;
    }
    public String getOvertimeData() {
        return OvertimeData;
    }

    public void setAttendanceData(String AttendanceData) {
        this.AttendanceData = AttendanceData;
    }
    public String getAttendanceData() {
        return AttendanceData;
    }

    public void setLeaveTheData(String LeaveTheData) {
        this.LeaveTheData = LeaveTheData;
    }
    public String getLeaveTheData() {
        return LeaveTheData;
    }

    public void setTravelTheData(String TravelTheData) {
        this.TravelTheData = TravelTheData;
    }
    public String getTravelTheData() {
        return TravelTheData;
    }

    public void setAttendancelType(String AttendancelType) {
        this.AttendancelType = AttendancelType;
    }
    public String getAttendancelType() {
        return AttendancelType;
    }

    public void setWorkingSystemText(String WorkingSystemText) {
        this.WorkingSystemText = WorkingSystemText;
    }
    public String getWorkingSystemText() {
        return WorkingSystemText;
    }

    public void setAccountingWork(String AccountingWork) {
        this.AccountingWork = AccountingWork;
    }
    public String getAccountingWork() {
        return AccountingWork;
    }

    public void setToday(boolean Today) {
        this.Today = Today;
    }
    public boolean getToday() {
        return Today;
    }

}

class JsonRootBean {

    private boolean Success;
    private String Message;
    private int Code;
    private int Total;
    private List<ReturnValue> ReturnValue;
    public void setSuccess(boolean Success) {
        this.Success = Success;
    }
    public boolean getSuccess() {
        return Success;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }
    public String getMessage() {
        return Message;
    }

    public void setCode(int Code) {
        this.Code = Code;
    }
    public int getCode() {
        return Code;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }
    public int getTotal() {
        return Total;
    }

    public void setReturnValue(List<ReturnValue> ReturnValue) {
        this.ReturnValue = ReturnValue;
    }
    public List<ReturnValue> getReturnValue() {
        return ReturnValue;
    }

}
