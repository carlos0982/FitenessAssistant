/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessassistant;

/**
 *
 * @author carlos
 */
public class DecisionTree {

    public String getTrainingPlan(Person person) {

        double IMC = person.computeIMC();
        String recomendation = "Work out";

        // Male selection
        if (person.gender.equals("MALE")) {
            // Begin age male between 18 and 25
            if (person.age >= 18 && person.age <= 25) {

                // Male with a IMC less than 18.5 
                if (IMC < 18.5) {

                    if (person.tieneEnfermedades) {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "Info: You are underweight, that \n"
                                        + "is associated with health risks such \n"
                                        + "as poor immune function and osteoporosis.\n"
                                        + " Hence, you are advised to increase \n"
                                        + "total caloric intake and follow the \n"
                                        + "recommendations of the Food Guide \n"
                                        + "Pyramid by consuming a variety \n"
                                        + "of nutrients from different food groups.\n"
                                        + "Stop immediately if you are on any \n"
                                        + "special diet or programme for weight loss.\n "
                                        + "Exercise: It is advisable to walk for \n"
                                        + "short periods of time (5 minutes would \n"
                                        + "be ok to start) and in a moderate rithm, \n"
                                        + "do not force yourself too much.Advice: \n"
                                        + "Try to leave the bad habits as smoking \n"
                                        + "and drinking in order to improve your health.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "Info:You are underweight, that \n"
                                        + "is associated with health risks such \n"
                                        + "as poor immune function and osteoporosis.\n"
                                        + "Stop immediately if you are on any special \n"
                                        + "diet or programme for weight loss.\n"
                                        + "Exercise:It is advisable to start with "
                                        + "some running or walking (7 - 12 minutes). \n"
                                        + "Avoid smoke / drinking.\n";
                            } else {
                                recomendation = "Info:You are underweight, that \n"
                                        + "is associated with health  risks such \n"
                                        + "as poor immune function and osteoporosis. \n"
                                        + "Stop immediately if you are on any special \n"
                                        + "diet or programme for weight loss. \n"
                                        + " It is advisable to run or walk for short \n"
                                        + "periods of time (10-15 minute). Avoid \n"
                                        + "smoke / drinking.\n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "Info:You are underweight, that \n"
                                        + "is associated with health risks such \n"
                                        + "as poor immune function and osteoporosis. \n"
                                        + "Stop immediately if you are on any special \n"
                                        + "diet or programme for weight loss. \n"
                                        + "  It is advisable to run for short \n"
                                        + "periods of time (10 minutes would be \n"
                                        + "ok to start) and in a moderate rithm, \n"
                                        + "do not force yourself too much. Avoid \n"
                                        + "smoke / drinking.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "Info:You are underweight, that \n"
                                        + "is associated with health  risks such \n"
                                        + "as poor immune function and osteoporosis. \n"
                                        + "Stop immediately if you are on any special \n"
                                        + "diet or programme for weight loss. \n"
                                        + "It is advisable to start with some running \n"
                                        + "(10 - 15 minutes).\n";
                            } else {
                                recomendation = "Info: You are underweight, that \n"
                                        + "is associated with health  risks such \n"
                                        + "as poor immune function and osteoporosis. \n"
                                        + "Stop immediately if you are on any special \n"
                                        + "diet or programme for weight loss.\n"
                                        + "It is advisable to run for short periods \n"
                                        + "of time (15-20 minute).\n";
                            }

                        }

                    } else {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "Info: You are underweight, that \n"
                                        + "is associated with health  risks such \n"
                                        + "as poor immune function and osteoporosis. \n"
                                        + "Stop immediately if you are on any special \n"
                                        + "diet or programme for weight loss.\n"
                                        + "You can start with 7 - 10 minutes of \n"
                                        + "cardio exercise (swimming, boxing, running)\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "Info: You are underweight, that \n"
                                        + "is associated with health  risks such \n"
                                        + "as poor immune function and osteoporosis. \n"
                                        + "Stop immediately if you are on any special \n"
                                        + "diet or programme for weight loss.\n"
                                        + " It is recommendable to start with cardio \n"
                                        + "exercise (swimming, boxing, running). \n"
                                        + "Avoid smoke / drinking.\n";
                            } else {
                                recomendation = "Info: You are underweight, that \n"
                                        + "is associated with health  risks such \n"
                                        + "as poor immune function and osteoporosis. \n"
                                        + "Stop immediately if you are on any special \n"
                                        + "diet or programme for weight loss.\n"
                                        + "Running for medium time periods of time \n"
                                        + "(25 - 30 minutes), and high intensity \n"
                                        + "aerobic (ex. swimming) and anaerobic \n"
                                        + "(lifting) activities./n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "Info: You are underweight, that \n"
                                        + "is associated with health  risks such \n"
                                        + "as poor immune function and osteoporosis. \n"
                                        + "Stop immediately if you are on any special \n"
                                        + "diet or programme for weight loss.\n"
                                        + "You can start with 10 - 15 minutes of \n"
                                        + "cardio exercise (swimming, boxing, running)\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "Info: You are underweight, that \n"
                                        + "is associated with health risks such \n"
                                        + "as poor immune function and osteoporosis. \n"
                                        + "Stop immediately if you are on any special \n"
                                        + "diet or programme for weight loss.\n"
                                        + "You can start cardio exercise (swimming, \n"
                                        + "boxing, running).\n";
                            } else {
                                recomendation = "You are underweight, that is \n"
                                        + "associated with health  risks such as \n"
                                        + "poor immune function and osteoporosis. \n"
                                        + "Stop immediately if you are on any special \n"
                                        + "diet or programme for weight loss.\n"
                                        + "Do (30 - 40 minutes), and high intensity \n"
                                        + "cardio activities.\n";
                            }

                        }

                    }

                    // Male with a IMC between 18.5 and 24.9
                } else if (IMC >= 18.5 && IMC <= 24.9) {

                    if (person.tieneEnfermedades) {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are in the normal weight. \n"
                                        + "However, a normal weight does not \n"
                                        + "necessarily mean optimal health. Thus \n"
                                        + "you should follow a balanced diet, \n"
                                        + "exercise regularly and lead a healthy \n"
                                        + "lifestyle while maintaining your weight.\n"
                                        + "It is advisable to walk for short periods \n"
                                        + "of time (5 minutes would be ok to start) \n"
                                        + "and in a moderate rithm, do not force \n"
                                        + "yourself too much. Try to leave the bad \n"
                                        + "habits as smoking and drinking in order \n"
                                        + "to improve your health.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are in the normal weight. \n"
                                        + "However, a normal weight does not \n"
                                        + "necessarily mean optimal health. Thus \n"
                                        + "you should follow a balanced diet, \n"
                                        + "exercise regularly and lead a healthy \n"
                                        + "lifestyle while maintaining your weight.\n"
                                        + "It is advisable to start with some running \n"
                                        + "or walking (7 - 12 minutes). Avoid smoke \n"
                                        + "/ drinking.\n";
                            } else {
                                recomendation = "You are in the normal weight. \n"
                                        + "However, a normal weight does not \n"
                                        + "necessarily mean optimal health. Thus \n"
                                        + "you should follow a balanced diet, exercise \n"
                                        + "regularly and lead a healthy lifestyle \n"
                                        + "while maintaining your weight.\n"
                                        + "It is advisable to run or walk for \n"
                                        + "short periods of time (10-15 minute). \n"
                                        + "Avoid smoke / drinking.\n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are in the normal weight. \n"
                                        + "However, a normal weight does not \n"
                                        + "necessarily mean optimal health. \n"
                                        + "Thus you should follow a balanced diet, \n"
                                        + "exercise regularly and lead a healthy l\n"
                                        + "ifestyle while maintaining your weight.\n"
                                        + " It is advisable to run for short periods \n"
                                        + "of time (10 minutes would be ok to start) \n"
                                        + "and in a moderate rithm, do not force \n"
                                        + "yourself too much. Avoid smoke / drinking.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are in the normal weight. \n"
                                        + "However, a normal weight does not \n"
                                        + "necessarily mean optimal health. \n"
                                        + "Thus you should follow a balanced diet, \n"
                                        + "exercise regularly and lead a healthy \n"
                                        + "lifestyle while maintaining your weight.\n"
                                        + " It is advisable to start with some \n"
                                        + "running (10 - 15 minutes).\n";
                            } else {
                                recomendation = "You are in the normal weight. \n"
                                        + "However, a normal weight does not \n"
                                        + "necessarily mean optimal health. \n"
                                        + "Thus you should follow a balanced diet, \n"
                                        + "exercise regularly and lead a healthy \n"
                                        + "lifestyle while maintaining your weight.\n"
                                        + "It is advisable to run for short \n"
                                        + "periods of time (15-20 minute).\n";
                            }

                        }

                    } else {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are in the normal weight. \n"
                                        + "However, a normal weight does not \n"
                                        + "necessarily mean optimal health. Thus \n"
                                        + "you should follow a balanced diet, \n"
                                        + "exercise regularly and lead a healthy \n"
                                        + "lifestyle while maintaining your weight.\n"
                                        + " You can start with 7 - 10 minutes of \n"
                                        + "cardio exercise (swimming, boxing, running).\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are in the normal weight. \n"
                                        + "However, a normal weight does not \n"
                                        + "necessarily mean optimal health. Thus \n"
                                        + "you should follow a balanced diet, \n"
                                        + "exercise regularly and lead a healthy \n"
                                        + "lifestyle while maintaining your weight.\n"
                                        + " It is recommendable to start with cardio \n"
                                        + "exercise (swimming, boxing, running). \n"
                                        + "Avoid smoke / drinking.\n";
                            } else {
                                recomendation = "You are in the normal weight. \n"
                                        + "However, a normal weight does not \n"
                                        + "necessarily mean optimal health. Thus \n"
                                        + "you should follow a balanced diet, \n"
                                        + "exercise regularly and lead a healthy \n"
                                        + "lifestyle while maintaining your weight.\n"
                                        + " Running for medium time periods of time \n"
                                        + "(25 - 30 minutes), and high intensity \n"
                                        + "aerobic (ex. swimming) and anaerobic \n"
                                        + "(lifting) activities. \n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are in the normal weight. \n"
                                        + "However, a normal weight does not \n"
                                        + "necessarily mean optimal health. \n"
                                        + "Thus you should follow a balanced diet, \n"
                                        + "exercise regularly and lead a healthy \n"
                                        + "lifestyle while maintaining your weight.\n"
                                        + "You can start with 10 - 15 minutes of \n"
                                        + "cardio exercise (swimming, boxing, running).\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are in the normal weight. "
                                        + "\nHowever, a normal weight does not \n"
                                        + "necessarily mean optimal health. Thus \n"
                                        + "you should follow a balanced diet, \n"
                                        + "exercise regularly and lead a healthy \n"
                                        + "lifestyle while maintaining your weight.\n"
                                        + " You can start cardio exercise (swimming, \n"
                                        + "boxing, running).\n";
                            } else {
                                recomendation = "You are in the normal weight.  \n"
                                        + "However, a normal weight does not necessarily \n"
                                        + "mean optimal health. Thus you should \n"
                                        + "follow a balanced diet, exercise regularly \n"
                                        + "and lead a healthy lifestyle while \n"
                                        + "maintaining your weight.\n"
                                        + " Do (30 - 40 minutes), and high intensity \n"
                                        + "cardio activities.\n";
                            }

                        }

                    }
                    // Male with a IMC between 25 and 29.9
                } else if (IMC >= 25 && IMC <= 29.9) {

                    if (person.tieneEnfermedades) {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are at increased risks of \n"
                                        + "obesity-related diseases such as diabetes \n"
                                        + "and cardiovascular diseases. In order to \n"
                                        + "prevent the above medical problems, you \n"
                                        + "are suggested to increase physical \n"
                                        + "activity, lead a less sedentary \n"
                                        + "lifestyle and reduce intake of high-fat, \n"
                                        + "high-sugar and high-calorie foods.\n"
                                        + "Please consult your doctor and dietitian \n"
                                        + "for specific recommendations on your \n"
                                        + "exercise programme and dietary modification. \n"
                                        + "You can start with 7 - 10 minutes of cardio \n"
                                        + "exercise (swimming, boxing, running)\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are at increased risks of \n"
                                        + "obesity-related diseases such as diabetes \n"
                                        + "and cardiovascular diseases. In order to \n"
                                        + "prevent the above medical problems, you \n"
                                        + "are suggested to increase physical activity, \n"
                                        + "lead a less sedentary lifestyle and reduce \n"
                                        + "intake of high-fat, high-sugar and high-calorie \n"
                                        + " foods. Please consult your doctor and \n"
                                        + "dietitian for specific recommendations on \n"
                                        + " your exercise programme and dietary \n"
                                        + "modification.It is recommendable to start \n"
                                        + "with cardio exercise (swimming, boxing, \n"
                                        + "running). Avoid smoke / drinking.\n";
                            } else {
                                recomendation = "You are at increased risks of obesity-\n"
                                        + "related diseases such as diabetes and \n"
                                        + "cardiovascular diseases. In order to \n"
                                        + "prevent the above medical problems, you \n"
                                        + "are suggested to increase physical activity, \n"
                                        + "lead a less sedentary lifestyle and reduce \n"
                                        + "intake of high-fat, high-sugar and high- \n"
                                        + "calorie foods. \n"
                                        + " Please consult your doctor and dietitian \n"
                                        + "for specific recommendations on your \n"
                                        + "exercise programme and dietary modification.\n"
                                        + "Running for medium time periods of time \n"
                                        + "(25 - 30 minutes), and high intensity aerobic \n"
                                        + "(ex. swimming) and anaerobic (lifting) activities. \n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are at increased risks of obesity-\n"
                                        + "related diseases such as diabetes and \n"
                                        + "cardiovascular diseases. In order to \n"
                                        + "prevent the above medical problems, you \n"
                                        + "are suggested to increase physical activity, \n"
                                        + "lead a less sedentary lifestyle and reduce \n"
                                        + "intake of high-fat, high-sugar and high- \n"
                                        + "calorie foods.\n"
                                        + "Please consult your doctor and dietitian \n"
                                        + "for specific recommendations on your \n"
                                        + "exercise programme and dietary modification. \n"
                                        + "You can start with 10 - 15 minutes of \n"
                                        + "cardio exercise (swimming, boxing, running)\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are at increased risks of obesity- \n"
                                        + "related diseases such as diabetes and \n"
                                        + "cardiovascular diseases. In order to prevent \n"
                                        + "the above medical problems, you are suggested \n"
                                        + "to increase physical activity, lead a less \n"
                                        + "sedentary lifestyle and reduce intake of \n"
                                        + "high-fat, high-sugar and high-calorie foods.\n"
                                        + "Please consult your doctor and dietitian \n"
                                        + "for specific recommendations on your \n"
                                        + "exercise programme and dietary modification. \n"
                                        + "You can start cardio exercise (swimming, \n"
                                        + "boxing, running). \n";
                            } else {
                                recomendation = "You are at increased risks of obesity \n"
                                        + "-related diseases such as diabetes and \n"
                                        + "cardiovascular diseases. In order to prevent \n"
                                        + "the above medical problems, you are \n"
                                        + "suggested to increase physical activity, \n"
                                        + "lead a less sedentary lifestyle and reduce \n"
                                        + "intake of high-fat, high-sugar and high-calorie \n"
                                        + "foods.\n"
                                        + "Please consult your doctor and dietitian \n"
                                        + "for specific recommendations on your \n"
                                        + "exercise programme and dietary modification. \n"
                                        + "Do (30 - 40 minutes), and high intensity \n"
                                        + "cardio activities.\n";
                            }

                        }

                    } else {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are at increased risks of \n"
                                        + "obesity-related diseases such as diabetes \n"
                                        + "and cardiovascular diseases. In order to \n"
                                        + "prevent the above medical problems, you are \n"
                                        + "suggested to increase physical activity, \n"
                                        + "lead a less sedentary lifestyle and reduce \n"
                                        + "intake of high-fat, high-sugar and high-\n"
                                        + "calorie foods.\n"
                                        + "Please consult your doctor and dietitian \n"
                                        + "for specific recommendations on your \n"
                                        + "exercise programme and dietary modification.\n"
                                        + "You can start with 7 - 10 minutes of cardio \n"
                                        + "exercise (swimming, boxing, running).\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are at increased risks of obesity-\n"
                                        + "related diseases such as diabetes and \n"
                                        + "cardiovascular diseases. In order to \n"
                                        + "prevent the above medical problems, \n"
                                        + "you are suggested to increase physical \n"
                                        + "activity, lead a less sedentary lifestyle \n"
                                        + "and reduce intake of high-fat, high-sugar \n"
                                        + "and high-calorie foods. Please consult \n"
                                        + "your doctor and dietitian for specific \n"
                                        + "recommendations on your exercise program \n"
                                        + "and dietary modification.\n"
                                        + "It is recommendable to start with cardio \n"
                                        + "exercise (swimming, boxing, running). \n"
                                        + "Avoid smoke / drinking.\n";
                            } else {
                                recomendation = "You are at increased risks of obesity-\n"
                                        + "related diseases such as diabetes and \n"
                                        + "cardiovascular diseases. In order to \n"
                                        + "prevent the above medical problems, \n"
                                        + "you are suggested to increase physical activity, \n"
                                        + "lead a less sedentary lifestyle and \n"
                                        + "reduce intake of high-fat, high-sugar \n"
                                        + "and high-calorie foods. Please consult \n"
                                        + "your doctor and dietitian for specific \n"
                                        + "recommendations on your exercise program \n"
                                        + "and dietary modification.\n"
                                        + "Running for medium time periods of time \n"
                                        + "(25 - 30 minutes), and high intensity aerobic \n"
                                        + "(ex. swimming) and anaerobic (lifting) \n"
                                        + "activities.\n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are at increased risks of obesity-\n"
                                        + "related diseases such as diabetes and \n"
                                        + "cardiovascular diseases. In order to \n"
                                        + "prevent the above medical problems, \n"
                                        + "you are suggested to increase physical \n"
                                        + "activity, lead a less sedentary lifestyle \n"
                                        + "and reduce intake of high-fat, high-sugar \n"
                                        + "and high-calorie foods. Please consult \n"
                                        + "your doctor and dietitian for specific \n"
                                        + "recommendations on your exercise programme \n"
                                        + "and dietary modification.\n"
                                        + " You can start with 10 - 15 minutes of \n"
                                        + "cardio exercise (swimming, boxing, running).\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are at increased risks of obesity-\n"
                                        + "related diseases such as diabetes and \n"
                                        + "cardiovascular diseases. In order to prevent \n"
                                        + "the above medical problems, you are suggested \n"
                                        + "to increase physical activity, lead a less \n"
                                        + "sedentary lifestyle and reduce intake of \n"
                                        + "high-fat, high-sugar and high-calorie foods. \n"
                                        + "Please consult your doctor and dietitian \n"
                                        + "for specific recommendations on your \n"
                                        + "exercise programme and dietary modification.\n"
                                        + " You can start cardio exercise (swimming, \n"
                                        + "boxing, running). \n";
                            } else {
                                recomendation = "You are at increased risks of obesity-\n"
                                        + "related diseases such as diabetes and \n"
                                        + "cardiovascular diseases. In order to prevent \n"
                                        + "the above medical problems, you are suggested \n"
                                        + "to increase physical activity, lead a less \n"
                                        + "sedentary lifestyle and reduce intake of \n"
                                        + "high-fat, high-sugar and high-calorie foods. \n"
                                        + "Please consult your doctor and dietitian \n"
                                        + "for specific recommendations on your \n"
                                        + "exercise programme and dietary modification.\n"
                                        + " Do (30 - 40 minutes), and high intensity \n"
                                        + "cardio activities.\n";
                            }

                        }

                    }
                    // Male with a IMC higher than 30
                } else if (IMC > 30) {

                    if (person.tieneEnfermedades) {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are obese. Obesity is an \n"
                                        + "important risk factor for various chronic \n"
                                        + "diseases such as diabetes, cardiovascular \n"
                                        + "diseases, osteoarthritis and certain cancers. \n"
                                        + "You should strive for a balance between \n"
                                        + "energy intake and expenditure by being \n"
                                        + "more active and following a calorie- \n"
                                        + "controlled but balanced diet. \n"
                                        + "It is also important to seek health advice \n"
                                        + "and set up a realistic weight management \n"
                                        + "goal with your doctor and dietitian. It \n"
                                        + "is advisable to walk for short periods \n"
                                        + "of time (5 minutes would be ok to start) \n"
                                        + "and in a moderate rithm, do not force \n"
                                        + "yourself too much. Try to leave the bad \n"
                                        + "habits as smoking and drinking in order \n"
                                        + "to improve your health.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are obese. Obesity is an important \n"
                                        + "risk factor for various chronic diseases \n"
                                        + " as diabetes, cardiovascular diseases, \n"
                                        + "osteoarthritis and certain cancers. \n"
                                        + "You should strive for a balance between \n"
                                        + "energy intake and expenditure by being \n"
                                        + "more active and following a calorie-controlled \n"
                                        + "but balanced diet. \n"
                                        + "It is also important to seek health \n"
                                        + "advice and set up a realistic weight \n"
                                        + "management goal with your doctor and dietitian. \n"
                                        + "It is advisable to walk for short periods \n"
                                        + "of time (5 minutes would be ok to start) \n"
                                        + "and in a moderate rithm, do not force \n"
                                        + "yourself too much. Try to leave the bad \n"
                                        + "habits as smoking and drinking in order \n"
                                        + "to improve your health.\n";
                            } else {
                                recomendation = "You are obese. Obesity is an important \n"
                                        + "risk factor for various chronic diseases \n"
                                        + "such as diabetes, cardiovascular diseases, \n"
                                        + "osteoarthritis and certain cancers. You \n"
                                        + "should strive for a balance between energy \n"
                                        + "intake and expenditure by being more active \n"
                                        + "and following a calorie-controlled but \n"
                                        + "balanced diet. \n"
                                        + "It is also important to seek health advice \n"
                                        + "and set up a realistic weight management \n"
                                        + "goal with your doctor and dietitian. It \n"
                                        + "is advisable to walk for short periods of time \n"
                                        + "(5 minutes would be ok to start) and in a \n"
                                        + "moderate rithm, do not force yourself too much. \n"
                                        + "Try to leave the bad habits as smoking and \n"
                                        + "drinking in order to improve your health.\n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are obese. Obesity is an important \n"
                                        + "risk factor for various chronic diseases \n"
                                        + "such as diabetes, cardiovascular diseases, \n"
                                        + "osteoarthritis and certain cancers. You \n"
                                        + "should strive for a balance between energy \n"
                                        + "intake and expenditure by being more active \n"
                                        + "and following a calorie-controlled but \n"
                                        + "balanced diet. \n"
                                        + "It is also important to seek health \n"
                                        + "advice and set up a realistic weight \n"
                                        + "management goal with your doctor and \n"
                                        + "dietitian. It is advisable to walk for \n"
                                        + "short periods of time (5 minutes would \n"
                                        + "be ok to start) and in a moderate rithm, \n"
                                        + "do not force yourself too much. Try to \n"
                                        + "leave the bad habits as smoking and drinking \n"
                                        + "in order to improve your health.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are obese. Obesity is an important \n"
                                        + "risk factor for various chronic diseases \n"
                                        + "such as diabetes, cardiovascular diseases, \n"
                                        + "osteoarthritis and certain cancers. \n"
                                        + "You should strive for a balance between \n"
                                        + "energy intake and expenditure by being \n"
                                        + "more active and following a calorie-controlled \n"
                                        + "but balanced diet. \n"
                                        + "It is also important to seek health advice \n"
                                        + "and set up a realistic weight management \n"
                                        + "goal with your doctor and dietitian. \n"
                                        + "It is advisable to walk for short periods \n"
                                        + "of time (5 minutes would be ok to start) \n"
                                        + "and in a moderate rithm, do not force \n"
                                        + "yourself too much. Try to leave the bad \n"
                                        + "habits as smoking and drinking in order \n"
                                        + "to improve your health.\n";
                            } else {
                                recomendation = "You are obese. Obesity is an important \n"
                                        + "risk factor for various chronic diseases \n"
                                        + "such as diabetes, cardiovascular diseases, \n"
                                        + "osteoarthritis and certain cancers. You \n"
                                        + "should strive for a balance between energy \n"
                                        + "intake and expenditure by being more active \n"
                                        + "and following a calorie-controlled but \n"
                                        + "balanced diet. \n"
                                        + "It is also important to seek health \n"
                                        + "advice and set up a realistic weight \n"
                                        + "management goal with your doctor and \n"
                                        + "dietitian. It is advisable to walk for \n"
                                        + "short periods of time (5 minutes would be \n"
                                        + "ok to start) and in a moderate rithm, do \n"
                                        + "not force yourself too much. Try to leave \n"
                                        + "the bad habits as smoking and drinking \n"
                                        + "in order to improve your health.\n";
                            }

                        }

                    } else {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are obese. Obesity is an important \n"
                                        + "risk factor for various chronic diseases \n"
                                        + "such as diabetes, cardiovascular diseases, \n"
                                        + "osteoarthritis and certain cancers. \n"
                                        + "You should strive for a balance between \n"
                                        + "energy intake and expenditure by being \n"
                                        + "more active and following a calorie-controlled \n"
                                        + "but balanced diet.\n"
                                        + " It is also important to seek health \n"
                                        + "advice and set up a realistic weight \n"
                                        + "management goal with your doctor and dietitian. \n"
                                        + "You can start with 7 - 10 minutes of \n"
                                        + "cardio exercise (swimming, boxing, running).\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are obese. Obesity is an important \n"
                                        + "risk factor for various chronic diseases such \n"
                                        + "as diabetes, cardiovascular diseases, \n"
                                        + "osteoarthritis and certain cancers. You \n"
                                        + "should strive for a balance between energy \n"
                                        + "intake and expenditure by being more active \n"
                                        + "and following a calorie-controlled but \n"
                                        + "balanced diet.\n"
                                        + "It is also important to seek health advice \n"
                                        + "and set up a realistic weight management goal \n"
                                        + "with your doctor and dietitian. It is \n"
                                        + "recommendable to start with cardio exercise \n"
                                        + "(swimming, boxing, running). Avoid smoke / \n"
                                        + "drinking.\n";
                            } else {
                                recomendation = "You are obese. Obesity is an important \n"
                                        + "risk factor for various chronic diseases \n"
                                        + "such as diabetes, cardiovascular diseases, \n"
                                        + "osteoarthritis and certain cancers. You \n"
                                        + "should strive for a balance between energy \n"
                                        + "intake and expenditure by being more active \n"
                                        + "and following a calorie-controlled but \n"
                                        + "balanced diet.\n"
                                        + " It is also important to seek health advice \n"
                                        + "and set up a realistic weight management goal \n"
                                        + "with your doctor and dietitian. Running \n"
                                        + "for medium time periods of time (25 - \n"
                                        + "30 minutes), and high intensity aerobic \n"
                                        + "(ex. swimming) and anaerobic (lifting) \n"
                                        + "activities. \n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are obese. Obesity is an important \n"
                                        + "risk factor for various chronic diseases such \n"
                                        + "as diabetes, cardiovascular diseases, \n"
                                        + "osteoarthritis and certain cancers. You \n"
                                        + "should strive for a balance between energy \n"
                                        + "intake and expenditure by being more active \n"
                                        + "and following a calorie-controlled but \n"
                                        + "balanced diet.\n"
                                        + " It is also important to seek health \n"
                                        + "advice and set up a realistic weight \n"
                                        + "management goal with your doctor and \n"
                                        + "dietitian. You can start with 10 - 15 \n"
                                        + "minutes of cardio exercise (swimming, \n"
                                        + "boxing, running).\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are obese. Underweight is associated \n"
                                        + "with health risks such as poor immune \n"
                                        + "function and osteoporosis. Stop immediately\n"
                                        + "if you are on any special diet or programme \n"
                                        + "for weight loss.  You can start cardio \n"
                                        + "exercise (swimming, boxing, running).\n";
                            } else {
                                recomendation = "You are obese. Obesity is an important \n"
                                        + "risk factor for various chronic diseases such \n"
                                        + "as diabetes, cardiovascular diseases, osteoarthritis \n"
                                        + "and certain cancers. You should strive for a \n"
                                        + "balance between energy intake and expenditure \n"
                                        + "by being more active and following a \n"
                                        + "calorie-controlled but balanced diet.\n"
                                        + " It is also important to seek health \n"
                                        + "advice and set up a realistic weight \n"
                                        + "management goal with your doctor and dietitian. \n"
                                        + "Do (30 - 40 minutes), and high intensity \n"
                                        + "cardio activities.\n";
                            }

                        }

                    }

                }

            } // Male age between 26 and 35
            else {

                if (IMC < 18.5) {

                    if (person.tieneEnfermedades) {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are underweight  may be undernourished \n"
                                        + "and getting insufficient amounts of vital \n"
                                        + "substances such as protein, minerals, \n"
                                        + "vitamins and essential fats. make sure \n"
                                        + "that you do not lose any more weight. \n"
                                        + "You may wish to gain weight and stabilise \n"
                                        + "it at a higher level. But do this slowly \n"
                                        + "but surely. Build up muscle mass.\n"
                                        + "The best diet is \"no diet\", as long as \n"
                                        + "the body is getting a well-balanced, \n"
                                        + "mainly plant-based mix of carbohydrates, \n"
                                        + "fats, proteins, minerals, vitamins and \n"
                                        + "enough, but not too much energy.  You \n"
                                        + "can start with 7 - 10 minutes of cardio \n"
                                        + "exercise (swimming, boxing, running)\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are underweight  may be undernourished \n"
                                        + "and getting insufficient amounts of vital \n"
                                        + "substances such as protein, minerals, \n"
                                        + "vitamins and essential fats. make sure \n"
                                        + "that you do not lose any more weight. \n"
                                        + "You may wish to gain weight and stabilise \n"
                                        + "it at a higher level. But do this slowly \n"
                                        + "but surely. Build up muscle mass.\n"
                                        + "The best diet is \"no diet\", as long \n"
                                        + "as the body is getting a well-balanced, \n"
                                        + "mainly plant-based mix of carbohydrates, \n"
                                        + "fats, proteins, minerals, vitamins and \n"
                                        + "enough, but not too much energy.  You can \n"
                                        + "start with 7 - 10 minutes of cardio exercise \n"
                                        + "(swimming, boxing, running)\n";
                            } else {
                                recomendation = "You are underweight  may be undernourished \n"
                                        + "and getting insufficient amounts of vital \n"
                                        + "substances such as protein, minerals, \n"
                                        + "vitamins and essential fats. make sure \n"
                                        + "that you do not lose any more weight. \n"
                                        + "You may wish to gain weight and stabilise \n"
                                        + "it at a higher level. But do this slowly \n"
                                        + "but surely. Build up muscle mass.\n"
                                        + "The best diet is \"no diet\", as long \n"
                                        + "as the body is getting a well-balanced, \n"
                                        + "mainly plant-based mix of carbohydrates, \n"
                                        + "fats, proteins, minerals, vitamins and \n"
                                        + "enough, but not too much energy.  You can \n"
                                        + "start with 7 - 10 minutes of cardio exercise \n"
                                        + "(swimming, boxing, running)\n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are underweight  may be undernourished \n"
                                        + "and getting insufficient amounts of vital \n"
                                        + "substances such as protein, minerals, \n"
                                        + "vitamins and essential fats. make sure \n"
                                        + "that you do not lose any more weight. \n"
                                        + "You may wish to gain weight and stabilise \n"
                                        + "it at a higher level. But do this slowly \n"
                                        + "but surely. Build up muscle mass.\n"
                                        + " The best diet is \"no diet\", as long as \n"
                                        + "the body is getting a well-balanced, \n"
                                        + "mainly plant-based mix of carbohydrates, \n"
                                        + "fats, proteins, minerals, vitamins and \n"
                                        + "enough, but not too much energy. It is \n"
                                        + "advisable to run for short periods of time \n"
                                        + "(10 minutes would be ok to start) and in a \n"
                                        + "moderate rithm, do not force yourself too \n"
                                        + "much. Avoid smoke / drinking.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are underweight  may be undernourished \n"
                                        + "and getting insufficient amounts of vital \n"
                                        + "substances such as protein, minerals, \n"
                                        + "vitamins and essential fats. make sure that \n"
                                        + "you do not lose any more weight. You may \n"
                                        + "wish to gain weight and stabilise it at \n"
                                        + "a higher level. But do this slowly but \n"
                                        + "surely. Build up muscle mass.\n"
                                        + " The best diet is \"no diet\", as long \n"
                                        + "as the body is getting a well-balanced, \n"
                                        + "mainly plant-based mix of carbohydrates, \n"
                                        + "fats, proteins, minerals, vitamins and \n"
                                        + "enough, but not too much energy.   \n"
                                        + "It is advisable to start with some \n"
                                        + "running (10 - 15 minutes).\n";
                            } else {
                                recomendation = "You are underweight  may be undernourished \n"
                                        + "and getting insufficient amounts of vital \n"
                                        + "substances such as protein, minerals, \n"
                                        + "vitamins and essential fats. make sure \n"
                                        + "that you do not lose any more weight. \n"
                                        + "You may wish to gain weight and stabilise \n"
                                        + "it at a higher level. But do this slowly \n"
                                        + "but surely. Build up muscle mass.\n"
                                        + " The best diet is \"no diet\", as long \n"
                                        + "as the body is getting a well-balanced, \n"
                                        + "mainly plant-based mix of carbohydrates, \n"
                                        + "fats, proteins, minerals, vitamins and \n"
                                        + "enough, but not too much energy.  It is \n"
                                        + "advisable to run for short periods of \n"
                                        + "time (15-20 minute).\n";
                            }

                        }

                    } else {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are underweight  may be undernourished \n"
                                        + "and getting insufficient amounts of vital \n"
                                        + "substances such as protein, minerals, \n"
                                        + "vitamins and essential fats. make sure \n"
                                        + "that you do not lose any more weight. \n"
                                        + "You may wish to gain weight and stabilise \n"
                                        + "it at a higher level. But do this slowly \n"
                                        + "but surely. Build up muscle mass.\n"
                                        + "The best diet is \"no diet\", as long as \n"
                                        + "the body is getting a well-balanced, mainly \n"
                                        + "plant-based mix of carbohydrates, fats, \n"
                                        + "proteins, minerals, vitamins and enough, \n"
                                        + "but not too much energy.  You can start \n"
                                        + "with 7 - 10 minutes of cardio exercise \n"
                                        + "(swimming, boxing, running)\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are underweight  may be undernourished \n"
                                        + "and getting insufficient amounts of vital \n"
                                        + "substances such as protein, minerals, \n"
                                        + "vitamins and essential fats. make sure \n"
                                        + "that you do not lose any more weight. \n"
                                        + "You may wish to gain weight and stabilise \n"
                                        + "it at a higher level. But do this slowly \n"
                                        + "but surely. Build up muscle mass.\n"
                                        + "The best diet is \"no diet\", as long as \n"
                                        + "the body is getting a well-balanced, \n"
                                        + "mainly plant-based mix of carbohydrates, \n"
                                        + "fats, proteins, minerals, vitamins and \n"
                                        + "enough, but not too much energy.  You can \n"
                                        + "start with 7 - 10 minutes of cardio \n"
                                        + "exercise (swimming, boxing, running)\n";
                            } else {
                                recomendation = "You are underweight  may be undernourished \n"
                                        + "and getting insufficient amounts of vital \n"
                                        + "substances such as protein, minerals, \n"
                                        + "vitamins and essential fats. make sure \n"
                                        + "that you do not lose any more weight. \n"
                                        + "You may wish to gain weight and stabilise \n"
                                        + "it at a higher level. But do this slowly \n"
                                        + "but surely. Build up muscle mass.\n"
                                        + "The best diet is \"no diet\", as long \n"
                                        + "as the body is getting a well-balanced, \n"
                                        + "mainly plant-based mix of carbohydrates, \n"
                                        + "fats, proteins, minerals, vitamins and \n"
                                        + "enough, but not too much energy.  You \n"
                                        + "can start with 7 - 10 minutes of cardio \n"
                                        + "exercise (swimming, boxing, running)\n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are underweight  may be undernourished \n"
                                        + "and getting insufficient amounts of vital \n"
                                        + "substances such as protein, minerals, \n"
                                        + "vitamins and essential fats. make sure \n"
                                        + "that you do not lose any more weight. \n"
                                        + "You may wish to gain weight and stabilise \n"
                                        + "it at a higher level. But do this slowly \n"
                                        + "but surely. Build up muscle mass.\n"
                                        + " The best diet is \"no diet\", as long as \n"
                                        + "the body is getting a well-balanced, \n"
                                        + "mainly plant-based mix of carbohydrates, \n"
                                        + "fats, proteins, minerals, vitamins and \n"
                                        + "enough, but not too much energy. You can \n"
                                        + "start with 10 - 15 minutes of cardio \n"
                                        + "exercise (swimming, boxing, running).\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are underweight  may be undernourished \n"
                                        + "and getting insufficient amounts of vital \n"
                                        + "substances such as protein, minerals, \n"
                                        + "vitamins and essential fats. make sure t\n"
                                        + "hat you do not lose any more weight. \n"
                                        + "You may wish to gain weight and stabilise \n"
                                        + "it at a higher level. But do this slowly \n"
                                        + "but surely. Build up muscle mass.\n"
                                        + " The best diet is \"no diet\", as long \n"
                                        + "as the body is getting a well-balanced, \n"
                                        + "mainly plant-based mix of carbohydrates, \n"
                                        + "fats, proteins, minerals, vitamins and \n"
                                        + "enough, but not too much energy.  You can \n"
                                        + "start cardio exercise (swimming, boxing, \n"
                                        + "running). \n";
                            } else {
                                recomendation = "You are underweight  may be undernourished \n"
                                        + "and getting insufficient amounts of vital \n"
                                        + "substances such as protein, minerals, \n"
                                        + "vitamins and essential fats. make sure \n"
                                        + " you do not lose any more weight. You \n"
                                        + "may wish to gain weight and stabilise \n"
                                        + "it at a higher level. But do this slowly \n"
                                        + "but surely. Build up muscle mass.\n"
                                        + " The best diet is \"no diet\", as long as \n"
                                        + "the body is getting a well-balanced, \n"
                                        + "mainly plant-based mix of carbohydrates,\n"
                                        + "fats, proteins, minerals, vitamins and \n"
                                        + "enough, but not too much energy. Do (30 - \n"
                                        + "40 minutes), and high intensity cardio \n"
                                        + "activities.\n";
                            }

                        }

                    }
                    // Male IMC between 18.5 and 24.9
                } else if (IMC >= 18.5 && IMC <= 24.9) {

                    if (person.tieneEnfermedades) {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are already in your optimal \n"
                                        + "weight range. Losing weight would add \n"
                                        + "no benefit to your health.Eat a variety \n"
                                        + "of foods that you like, optimally including \n"
                                        + "five servings of fruit and/or vegetables a day. \n"
                                        + "Avoid eating too sweet, too fat and too much.\n"
                                        + "It is advisable to run for short periods of \n"
                                        + "time (10 minutes would be ok to start) and \n"
                                        + "in a moderate rithm, do not force yourself \n"
                                        + "too much. Avoid smoke / drinking.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are already in your optimal \n"
                                        + "weight range. Losing weight would add \n"
                                        + "no benefit to your health.Eat a variety \n"
                                        + "of foods that you like, optimally including \n"
                                        + "five servings of fruit and/or vegetables a day. \n"
                                        + "Avoid eating too sweet, too fat and too much.\n"
                                        + "It is advisable to run for short periods of \n"
                                        + "time (10 minutes would be ok to start) and \n"
                                        + "in a moderate rithm, do not force yourself \n"
                                        + "too much. Avoid smoke / drinking.\n";
                            } else {
                                recomendation = "You are already in your optimal \n"
                                        + "weight range. Losing weight would add \n"
                                        + "no benefit to your health.Eat a variety \n"
                                        + "of foods that you like, optimally including \n"
                                        + "five servings of fruit and/or vegetables \n"
                                        + "a day. Avoid eating too sweet, too fat \n"
                                        + "and too much.\n"
                                        + "It is advisable to run for short periods \n"
                                        + "of time (10 minutes would be ok to start) \n"
                                        + "and in a moderate rithm, do not force \n"
                                        + "yourself too much. Avoid smoke / drinking.\n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are already in your optimal \n"
                                        + "weight range. Losing weight would add \n"
                                        + "no benefit to your health.Eat a variety \n"
                                        + "of foods that you like, optimally including \n"
                                        + "five servings of fruit and/or vegetables \n"
                                        + "a day. Avoid eating too sweet, too fat \n"
                                        + "and too much.\n"
                                        + "It is advisable to run for short periods \n"
                                        + "of time (10 minutes would be ok to start) \n"
                                        + "and in a moderate rithm, do not force \n"
                                        + "yourself too much. Avoid smoke / drinking.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are already in your optimal \n"
                                        + "weight range. Losing weight would add \n"
                                        + "no benefit to your health.Eat a variety \n"
                                        + "of foods that you like, optimally including \n"
                                        + "five servings of fruit and/or vegetables a day. \n"
                                        + "Avoid eating too sweet, too fat and too much.\n"
                                        + "It is advisable to run for short periods \n"
                                        + "of time (10 minutes would be ok to start) \n"
                                        + "and in a moderate rithm, do not force \n"
                                        + "yourself too much. Avoid smoke / drinking.\n";
                            } else {
                                recomendation = "You are already in your optimal \n"
                                        + "weight range. Losing weight would add \n"
                                        + "no benefit to your health.Eat a variety \n"
                                        + "of foods that you like, optimally including \n"
                                        + "five servings of fruit and/or vegetables a \n"
                                        + "day. Avoid eating too sweet, too fat and \n"
                                        + "too much.\n"
                                        + "It is advisable to run for short periods \n"
                                        + "of time (10 minutes would be ok to start) \n"
                                        + "and in a moderate rithm, do not force \n"
                                        + "yourself too much. Avoid smoke / drinking.\n";
                            }

                        }

                    } else {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are already in your optimal \n"
                                        + "weight range. Losing weight would \n"
                                        + "add no benefit to your health.Eat a \n"
                                        + "variety of foods that you like, \n"
                                        + "optimally including five servings \n"
                                        + "of fruit and/or vegetables a day.\n"
                                        + " Avoid eating too sweet, too fat and \n"
                                        + "too much.  You can start with 7 - 10 \n"
                                        + "minutes of cardio exercise (swimming, \n"
                                        + "boxing, running).\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are already in your optimal \n"
                                        + "weight range. Losing weight would add \n"
                                        + "no benefit to your health.Eat a variety \n"
                                        + "of foods that you like, optimally including \n"
                                        + "five servings of fruit and/or vegetables a day.\n"
                                        + " Avoid eating too sweet, too fat and too \n"
                                        + "much.  It is recommendable to start with \n"
                                        + "cardio exercise (swimming, boxing, running). \n"
                                        + "Avoid smoke / drinking.\n";
                            } else {
                                recomendation = "You are already in your optimal \n"
                                        + "weight range. Losing weight would add \n"
                                        + "no benefit to your health.Eat a variety \n"
                                        + "of foods that you like, optimally including \n"
                                        + "five servings of fruit and/or vegetables \n"
                                        + "a day.\n"
                                        + " Avoid eating too sweet, too fat and too \n"
                                        + "much.  Running for medium time periods of \n"
                                        + "time (25 - 30 minutes), and high intensity \n"
                                        + "aerobic (ex. swimming) and anaerobic \n"
                                        + "(lifting) activities. \n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are already in your optimal \n"
                                        + "weight range. Losing weight would add \n"
                                        + "no benefit to your health.Eat a variety \n"
                                        + "of foods that you like, optimally including \n"
                                        + "five servings of fruit and/or vegetables \n"
                                        + " day.\n"
                                        + " Avoid eating too sweet, too fat and too \n"
                                        + "much. You can start with 10 - 15 minutes \n"
                                        + "of cardio exercise (swimming, boxing, \n"
                                        + "running).\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are already in your optimal \n"
                                        + "weight range. Losing weight would add \n"
                                        + "no benefit to your health.Eat a variety \n"
                                        + "of foods that you like, optimally including \n"
                                        + "five servings of fruit and/or vegetables \n"
                                        + "a day.\n"
                                        + " Avoid eating too sweet, too fat and too \n"
                                        + "much.  You can start cardio exercise \n"
                                        + "(swimming, boxing, running). \n";
                            } else {
                                recomendation = "You are already in your optimal \n"
                                        + "weight range. Losing weight would add \n"
                                        + "no benefit to your health.Eat a variety \n"
                                        + "of foods that you like, optimally including \n"
                                        + "five servings of fruit and/or vegetables \n"
                                        + "a day.\n"
                                        + " Avoid eating too sweet, too fat and too \n"
                                        + "much. Do (30 - 40 minutes), and high \n"
                                        + "cardio activities.\n";
                            }

                        }

                    }
                    // Male Age between 25 and 29.9
                } else if (IMC >= 25 && IMC <= 29.9) {

                    if (person.tieneEnfermedades) {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are \"overweight\". At this \n"
                                        + "weight level, you are at risk of gaining \n"
                                        + "more weight. The best you can do is eat \n"
                                        + "healthy food and increase your fitness. \n"
                                        + "This will boost your health, whatever \n"
                                        + "the case.\n"
                                        + "It is advisable to walk for short periods \n"
                                        + "of time (5 minutes would be ok to start) \n"
                                        + "and in a moderate rithm, do not force \n"
                                        + "yourself too much. Try to leave the bad \n"
                                        + "habits as smoking and drinking in order \n"
                                        + "to improve your health.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are \"overweight\". At this \n"
                                        + "weight level, you are at risk of gaining \n"
                                        + "more weight. The best you can do is eat \n"
                                        + "healthy food and increase your fitness. \n"
                                        + "This will boost your health, whatever \n"
                                        + "the case.\n"
                                        + "It is advisable to walk for short periods \n"
                                        + "of time (5 minutes would be ok to start) \n"
                                        + "and in a moderate rithm, do not force \n"
                                        + "yourself too much. Try to leave the bad \n"
                                        + "habits as smoking and drinking in order \n"
                                        + "to improve your health.\n";
                            } else {
                                recomendation = "You are \"overweight\". At this \n"
                                        + "weight level, you are at risk of gaining \n"
                                        + "more weight. The best you can do is eat \n"
                                        + "healthy food and increase your fitness. \n"
                                        + "This will boost your health, whatever \n"
                                        + "the case.\n"
                                        + "It is advisable to walk for short periods \n"
                                        + "of time (5 minutes would be ok to start) \n"
                                        + "and in a moderate rithm, do not force \n"
                                        + "yourself too much. Try to leave the bad \n"
                                        + "habits as smoking and drinking in order \n"
                                        + "to improve your health.\n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are \"overweight\". At this \n"
                                        + "weight level, you are at risk of gaining \n"
                                        + "more weight. The best you can do is eat \n"
                                        + "healthy food and increase your fitness. \n"
                                        + "This will boost your health, whatever the case.\n"
                                        + "It is advisable to walk for short periods \n"
                                        + "of time (5 minutes would be ok to start) \n"
                                        + "and in a moderate rithm, do not force \n"
                                        + "yourself too much. Try to leave the bad \n"
                                        + "habits as smoking and drinking in order \n"
                                        + "to improve your health.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are \"overweight\". At this \n"
                                        + "weight level, you are at risk of gaining \n"
                                        + "more weight. The best you can do is eat \n"
                                        + "healthy food and increase your fitness. \n"
                                        + "This will boost your health, whatever the case.\n"
                                        + "It is advisable to walk for short periods \n"
                                        + "of time (5 minutes would be ok to start) \n"
                                        + "and in a moderate rithm, do not force \n"
                                        + "yourself too much. Try to leave the bad \n"
                                        + "habits as smoking and drinking in order \n"
                                        + "to improve your health.\n";
                            } else {
                                recomendation = "You are \"overweight\". At this \n"
                                        + "weight level, you are at risk of \n"
                                        + "gaining more weight. The best you can \n"
                                        + "do is eat healthy food and increase your \n"
                                        + "fitness. This will boost your health, \n"
                                        + "whatever the case.\n"
                                        + "It is advisable to walk for short periods \n"
                                        + "of time (5 minutes would be ok to start) \n"
                                        + "and in a moderate rithm, do not force \n"
                                        + "yourself too much. Try to leave the bad \n"
                                        + "habits as smoking and drinking in order \n"
                                        + "to improve your health.\n";
                            }

                        }

                    } else {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are \"overweight\". At this \n"
                                        + "weight level, you are at risk of gaining \n"
                                        + "more weight. The best you can do is eat \n"
                                        + "healthy food and increase your fitness. \n"
                                        + "This will boost your health, whatever the case.\n"
                                        + "  In order to prevent the above medical \n"
                                        + "problems, you are suggested to increase \n"
                                        + "physical activity, lead a less sedentary \n"
                                        + "lifestyle and reduce intake of high-fat, \n"
                                        + "high-sugar and high-calorie foods. Please \n"
                                        + "consult your doctor and dietitian for \n"
                                        + "specific recommendations on your exercise \n"
                                        + "programme and dietary modification.\n"
                                        + " You can start with 7 - 10 minutes of \n"
                                        + "cardio exercise (swimming, boxing, running).\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are \"overweight\". At this \n"
                                        + "weight level, you are at risk of gaining \n"
                                        + "more weight. The best you can do is eat \n"
                                        + "healthy food and increase your fitness. \n"
                                        + "This will boost your health, whatever \n"
                                        + "the case. \n"
                                        + "In order to prevent the above medical problems, \n"
                                        + "you are suggested to increase physical activity, \n"
                                        + "lead a less sedentary lifestyle and reduce \n"
                                        + "intake of high-fat, high-sugar and high-\n"
                                        + "calorie foods.\n"
                                        + " Please consult your doctor and dietitian \n"
                                        + "for specific recommendations on your exercise \n"
                                        + "programme and dietary modification. \n"
                                        + "It is recommendable to start with cardio \n"
                                        + "exercise (swimming, boxing, running). \n"
                                        + "Avoid smoke / drinking.\n";
                            } else {
                                recomendation = "You are \"overweight\". At this \n"
                                        + "weight level, you are at risk of gaining \n"
                                        + "more weight. The best you can do is eat \n"
                                        + "healthy food and increase your fitness. \n"
                                        + "This will boost your health, whatever \n"
                                        + "the case.   \n"
                                        + "In order to prevent the above medical \n"
                                        + "problems, you are suggested to increase \n"
                                        + "physical activity, lead a less sedentary \n"
                                        + "lifestyle and reduce intake of high-fat, \n"
                                        + "high-sugar and high-calorie foods.\n"
                                        + " Please consult your doctor and dietitian \n"
                                        + "for specific recommendations on your exercise \n"
                                        + "programme and dietary modification. Running \n"
                                        + "for medium time periods of time (25 - \n"
                                        + "30 minutes), and high intensity aerobic \n"
                                        + "(ex. swimming) and anaerobic (lifting) \n"
                                        + "activities. \n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are \"overweight\". At this \n"
                                        + " level, you are at risk of gaining more \n"
                                        + "weight. The best you can do is eat healthy \n"
                                        + "food and increase your fitness. This will \n"
                                        + "boost your health, whatever the case.   \n"
                                        + "In order to prevent the above medical \n"
                                        + "problems, you are suggested to increase \n"
                                        + "physical activity, lead a less sedentary \n"
                                        + "lifestyle and reduce intake of high-fat, \n"
                                        + "high-sugar and high-calorie foods.\n"
                                        + " Please consult your doctor and dietitian \n"
                                        + "for specific recommendations on your \n"
                                        + "exercise programme and dietary modification. \n"
                                        + " can start with 10 - 15 minutes of cardio \n'"
                                        + "exercise (swimming, boxing, running).\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are \"overweight\". At this weight level, you are at risk of gaining more weight. The best you can do is eat healthy food and increase your fitness. This will boost your health, whatever the case.   In order to prevent the above medical problems, you are suggested to increase physical activity, lead a less sedentary lifestyle and reduce intake of high-fat, high-sugar and high-calorie foods.\n"
                                        + " Please consult your doctor and dietitian for specific recommendations on your exercise programme and dietary modification. You can start cardio exercise (swimming, boxing, running). \n";
                            } else {
                                recomendation = "You are \"overweight\". At this weight level, you are at risk of gaining more weight. The best you can do is eat healthy food and increase your fitness. This will boost your health, whatever the case.   In order to prevent the above medical problems, you are suggested to increase physical activity, lead a less sedentary lifestyle and reduce intake of high-fat, high-sugar and high-calorie foods.\n"
                                        + " Please consult your doctor and dietitian for specific recommendations on your exercise programme and dietary modification. Do (30 - 40 minutes), and high intensity cardio activities.\n";
                            }

                        }

                    }

                } else if (IMC > 30) {

                    if (person.tieneEnfermedades) {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are \"obese\" make sure that you do not gain any more weight. Next you may want to lose weight and stabilise it at a lower level. But do this slowly but surely. It is also important to seek health advice and set up a realistic weight management goal with your doctor and dietitian. It is advisable to walk for short periods of time (5 minutes would be ok to start) and in a moderate rithm, do not force yourself too much. Try to leave the bad habits as smoking and drinking in order to improve your health.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are \"obese\" make sure that you do not gain any more weight. Next you may want to lose weight and stabilise it at a lower level. But do this slowly but surely. It is also important to seek health advice and set up a realistic weight management goal with your doctor and dietitian. It is advisable to start with some running or walking (7 - 12 minutes). Avoid smoke / drinking.\n";
                            } else {
                                recomendation = "You are \"obese\" make sure that you do not gain any more weight. Next you may want to lose weight and stabilise it at a lower level. But do this slowly but surely. It is also important to seek health advice and set up a realistic weight management goal with your doctor and dietitian. It is also important to seek health advice and set up a realistic weight management goal with your doctor and dietitian. It is advisable to run or walk for short periods of time (10-15 minute). Avoid smoke / drinking.\n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are \"obese\" make sure that you do not gain any more weight. Next you may want to lose weight and stabilise it at a lower level. But do this slowly but surely. It is also important to seek health advice and set up a realistic weight management goal with your doctor and dietitian.It is advisable to run for short periods of time (10 minutes would be ok to start) and in a moderate rithm, do not force yourself too much. Avoid smoke / drinking.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are \"obese\" make sure that you do not gain any more weight. Next you may want to lose weight and stabilise it at a lower level. But do this slowly but surely. It is also important to seek health advice and set up a realistic weight management goal with your doctor and dietitian.It is advisable to start with some running (10 - 15 minutes).\n";
                            } else {
                                recomendation = "You are \"obese\" make sure that you do not gain any more weight. Next you may want to lose weight and stabilise it at a lower level. But do this slowly but surely. It is also important to seek health advice and set up a realistic weight management goal with your doctor and dietitian.  It is advisable to run for short periods of time (15-20 minute).\n";
                            }

                        }

                    } else {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are \"obese\" make sure that you do not gain any more weight. Next you may want to lose weight and stabilise it at a lower level. But do this slowly but surely. It is also important to seek health advice and set up a realistic weight management goal with your doctor and dietitian. You can start with 7 - 10 minutes of cardio exercise (swimming, boxing, running).\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are \"obese\" make sure that you do not gain any more weight. Next you may want to lose weight and stabilise it at a lower level. But do this slowly but surely. It is also important to seek health advice and set up a realistic weight management goal with your doctor and dietitian.It is recommendable to start with cardio exercise (swimming, boxing, running). Avoid smoke / drinking.\n";
                            } else {
                                recomendation = "You are \"obese\" make sure that you do not gain any more weight. Next you may want to lose weight and stabilise it at a lower level. But do this slowly but surely. It is also important to seek health advice and set up a realistic weight management goal with your doctor and dietitian.Running for medium time periods of time (25 - 30 minutes), and high intensity aerobic (ex. swimming) and anaerobic (lifting) activities. \n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are \"obese\" make sure that you do not gain any more weight. Next you may want to lose weight and stabilise it at a lower level. But do this slowly but surely. It is also important to seek health advice and set up a realistic weight management goal with your doctor and dietitian. You can start with 10 - 15 minutes of cardio exercise (swimming, boxing, running).\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are \"obese\" make sure that you do not gain any more weight. Next you may want to lose weight and stabilise it at a lower level. But do this slowly but surely. It is also important to seek health advice and set up a realistic weight management goal with your doctor and dietitian. You can start cardio exercise (swimming, boxing, running). \n";
                            } else {
                                recomendation = "You are \"obese\" make sure that you do not gain any more weight. Next you may want to lose weight and stabilise it at a lower level. But do this slowly but surely. It is also important to seek health advice and set up a realistic weight management goal with your doctor and dietitian. Do (30 - 40 minutes), and high intensity cardio activities.\n";
                            }

                        }

                    }

                }

            }
        } // Female Selection
        else {

            if (person.age >= 18 && person.age <= 25) {

                if (IMC < 18.5) {

                    if (person.tieneEnfermedades) {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "Info: You are underweight.\n"
                                        + " Exercise: Walk or run for short periods of time (5 minutes would be ok to start) and in a moderate rithm, do not force yourself too much.\n"
                                        + " You can also do some spinning and aerobics but in a moderate way. \n"
                                        + " Advice: Try to leave the bad habits as smoking and drinking in order to improve your health.\n"
                                        + " Nutrition: Eat more protein and vegetables according to the recommendations of your doctor.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "Info: You are underweight.\n"
                                        + "  Exercise: Start with some running or walking (7 - 12 minutes), and some cardio as aerobics are recommended too.\n"
                                        + " Just be moderate with the activities you do, do jo force your body too much.\n"
                                        + "  Advice: Try to leave the bad habits as smoking and drinking in order to improve your health. \n"
                                        + " Nutrition: eat more protein and vegetables according to the recommendations of your doctor.";
                            } else {
                                recomendation = "Info: You are underweight. It is advisable to run or walk for short periods of time (10-15 minute), do some spinning and aerobiocs.\n"
                                        + " You can also try to include some weigh in your activities, such as dumbbells according to your physical strength.\n"
                                        + " Do not force yourself too much and try to leave the bad habits as smoking and drinking in order to improve your health, and eat more protein and vegetables according to the recommendations of your doctor.\n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "Info: You are underweight. It is advisable to run for short periods of time (10 minutes would be ok to start) and in a moderate rithm, do not force yourself too much.\n"
                                        + " You can also do some spinning and aerobics but in a moderate way. You are under the normal weigh for your heigh, so it is recommendable for you to eat more protein and vegetables as well as some carbohidrates and fats.\n";

                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "Info: You are underweight. It is advisable to start with some running (10 - 15 minutes), and some cardio as aerobics are recommended too. Just be moderate with the activities you do, do jo force your body too much.\n"
                                        + " You are under the normal weigh for your heigh, so it is recommendable for you to eat more protein and vegetables as well as some carbohidrates and fats.";

                            } else {
                                recomendation = "Info: You are underweight. It is advisable to run for short periods of time (15-20 minute), do some spinning and aerobiocs. You can also try to include some weigh in your activities, such as dumbbells according to your physical strength.\n"
                                        + " Do not force yourself too much, do it in a rithm you can maitain. You are under the normal weigh for your heigh, so it is recommendable for you to eat more protein and vegetables as well as some carbohidrates and fats.\n";

                            }

                        }

                    } else {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "Info: You are underweight. Some cardio as running and aerobics are recommended, you can start with 7 - 10 minutes of excersise of either cardio activity mentioned. You can also include some dumpbells in your training, but being careful of not force your body too much, lift only what you can support. Try to leave the bad habits as smoking and drinking in order to improve your health. You are under the normal weigh for your heigh, so it is recommendable for you to eat more protein and vegetables as well as some carbohidrates and fats.";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "Info: You are underweight. It is recommendable to start with some cardio excercises such as running, sppining and some aerobics. You can also try dancing and some gimnastics with moderate intensity. In addintions, you can try lifting dumpbells with the appropiate weigh. Try to leave the bad habits as smoking and drinking in order to improve your health. You are under the normal weigh for your heigh, so it is recommendable for you to eat more protein and vegetables as well as some carbohidrates and fats.";
                            } else {
                                recomendation = "Info: You are underweight. Running for medium time periods of time (25 - 30 minutes), and high intensity aerobics are recommended activities. You can also try lifting some dumpbells according to what you can support, doing some gimnastics, and dancing. Try to leave the bad habits as smoking and drinking in order to improve your health. You are under the normal weigh for your heigh, so it is recommendable for you to eat more protein and vegetables as well as some carbohidrates and fats.\n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "Info: You are underweight. Some cardio as running and aerobics are recommended, you can start with 10 - 15 minutes of excersise of either cardio activity mentioned. You can also include some dumpbells in your training, but being careful of not force your body too much, lift only what you can support. You are under the normal weigh for your heigh, so it is recommendable for you to eat more protein and vegetables as well as some carbohidrates and fats.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "Info: You are underweight. It is recommendable to start with some cardio excercises such as running, sppining and some aerobics. You can also try dancing and some gimnastics with moderate intensity. In addintions, you can try lifting dumpbells with the appropiate weigh. You are under the normal weigh for your heigh, so it is recommendable for you to eat more protein and vegetables as well as some carbohidrates and fats. \n";
                            } else {
                                recomendation = "Info: You are underweight. Running for long periods of time (30 - 40 minutes), and high intensity aerobics are recommended activities. You can also try lifting some dumpbells according to what you can support, doing some gimnastics, and dancing. You are under the normal weigh for your heigh, so it is recommendable for you to eat more protein and vegetables as well as some carbohidrates and fats.\n";
                            }

                        }

                    }

                } else if (IMC >= 18.5 && IMC <= 24.9) {

                    if (person.tieneEnfermedades) {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are in the normal weight. It is advisable to walk or run for short periods of time (5 minutes would be ok to start) and in a moderate rithm, do not force yourself too much. You can also do some spinning and aerobics but in a moderate way. Try to leave the bad habits as smoking and drinking in order to improve your health.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are in the normal weight. It is advisable to start with some running or walking (7 - 12 minutes), and some cardio as aerobics are recommended too. Just be moderate with the activities you do, do jo force your body too much. Try to leave the bad habits as smoking and drinking in order to improve your health.\n";
                            } else {
                                recomendation = "You are in the normal weight. It is advisable to run or walk for short periods of time (10-15 minute), do some spinning and aerobiocs. You can also try to include some weigh in your activities, such as dumbbells according to your physical strength. Do not force yourself too much and try to leave the bad habits as smoking and drinking in order to improve your health.\n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are in the normal weight. It is advisable to run for short periods of time (10 minutes would be ok to start) and in a moderate rithm, do not force yourself too much. You can also do some spinning and aerobics but in a moderate way. \n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are in the normal weight. It is advisable to start with some running (10 - 15 minutes), and some cardio as aerobics are recommended too. Just be moderate with the activities you do, do jo force your body too much. \n";
                            } else {
                                recomendation = "You are in the normal weight. It is advisable to run for short periods of time (15-20 minute), do some spinning and aerobiocs. You can also try to include some weigh in your activities, such as dumbbells according to your physical strength. Do not force yourself too much, do it in a rithm you can maitain. \n";
                            }

                        }

                    } else {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are in the normal weight. Some cardio as running and aerobics are recommended, you can start with 7 - 10 minutes of excersise of either cardio activity mentioned. You can also include some dumpbells in your training, but being careful of not force your body too much, lift only what you can support. Try to leave the bad habits as smoking and drinking in order to improve your health. \n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are in the normal weight. It is recommendable to start with some cardio excercises such as running, sppining and some aerobics. You can also try dancing and some gimnastics with moderate intensity. In addintions, you can try lifting dumpbells with the appropiate weigh. Try to leave the bad habits as smoking and drinking in order to improve your health.\n";
                            } else {
                                recomendation = "You are in the normal weight. Running for medium time periods of time (25 - 30 minutes), and high intensity aerobics are recommended activities. You can also try lifting some dumpbells according to what you can support, doing some gimnastics, and dancing. Try to leave the bad habits as smoking and drinking in order to improve your health. \n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are in the normal weight. Some cardio as running and aerobics are recommended, you can start with 10 - 15 minutes of excersise of either cardio activity mentioned. You can also include some dumpbells in your training, but being careful of not force your body too much, lift only what you can support. \n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are in the normal weight. It is recommendable to start with some cardio excercises such as running, sppining and some aerobics. You can also try dancing and some gimnastics with moderate intensity. In addintions, you can try lifting dumpbells with the appropiate weigh. \n";
                            } else {
                                recomendation = "You are in the normal weight. Running for long periods of time (30 - 40 minutes), and high intensity aerobics are recommended activities. You can also try lifting some dumpbells according to what you can support, doing some gimnastics, and dancing.  \n";
                            }

                        }

                    }

                } else if (IMC >= 25 && IMC <= 29.9) {

                    if (person.tieneEnfermedades) {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are at increased risks of obesity-related diseases. It is advisable to walk or run for short periods of time (5 minutes would be ok to start) and in a moderate rithm, do not force yourself too much. You can also do some spinning and aerobics but in a moderate way.\n"
                                        + "Try to leave the bad habits as smoking and drinking in order to improve your health. You are over the normal weigth for your heigh, so you should reduce the comsume of carbohidrates, and fats; but you shluld check with your doctor to be sure.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are at increased risks of obesity-related diseases. It is advisable to start with some running or walking (7 - 12 minutes), and some cardio as aerobics are recommended too. Just be moderate with the activities you do, do jo force your body too much. Try to leave the bad habits as smoking and drinking in order to improve your health. You are over the normal weigth for your heigh, so you should reduce the comsume of carbohidrates, and fats; but you shluld check with your doctor to be sure.\n";
                            } else {
                                recomendation = "You are at increased risks of obesity-related diseases. It is advisable to run or walk for short periods of time (10-15 minute), do some spinning and aerobiocs. You can also try to include some weigh in your activities, such as dumbbells according to your physical strength. Do not force yourself too much and try to leave the bad habits as smoking and drinking in order to improve your health. You are over the normal weigth for your heigh, so you should reduce the comsume of carbohidrates, and fats; but you shluld check with your doctor to be sure.\n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are at increased risks of obesity-related diseases. It is advisable to run for short periods of time (10 minutes would be ok to start) and in a moderate rithm, do not force yourself too much. You can also do some spinning and aerobics but in a moderate way. You are over the normal weigth for your heigh, so you should reduce the comsume of carbohidrates, and fats.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are at increased risks of obesity-related diseases. It is advisable to start with some running (10 - 15 minutes), and some cardio as aerobics are recommended too. Just be moderate with the activities you do, do jo force your body too much. You are over the normal weigth for your heigh, so you should reduce the comsume of carbohidrates, and fats.\n";
                            } else {
                                recomendation = "You are at increased risks of obesity-related diseases. It is advisable to run for short periods of time (15-20 minute), do some spinning and aerobiocs. You can also try to include some weigh in your activities, such as dumbbells according to your physical strength. Do not force yourself too much, do it in a rithm you can maitain. You are over the normal weigth for your heigh, so you should reduce the comsume of carbohidrates, and fats.\n";
                            }

                        }

                    } else {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are at increased risks of obesity-related diseases. Some cardio as running and aerobics are recommended, you can start with 7 - 10 minutes of excersise of either cardio activity mentioned. You can also include some dumpbells in your training, but being careful of not force your body too much, lift only what you can support. Try to leave the bad habits as smoking and drinking in order to improve your health. You are over the normal weigth for your heigh, so you should reduce the comsume of carbohidrates, and fats.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are at increased risks of obesity-related diseases. It is recommendable to start with some cardio excercises such as running, sppining and some aerobics. You can also try dancing and some gimnastics with moderate intensity. In addintions, you can try lifting dumpbells with the appropiate weigh. Try to leave the bad habits as smoking and drinking in order to improve your health. You are over the normal weigth for your heigh, so you should reduce the comsume of carbohidrates, and fats.\n";
                            } else {
                                recomendation = "You are at increased risks of obesity-related diseases. Running for medium time periods of time (25 - 30 minutes), and high intensity aerobics are recommended activities. You can also try lifting some dumpbells according to what you can support, doing some gimnastics, and dancing. Try to leave the bad habits as smoking and drinking in order to improve your health. You are over the normal weigth for your heigh, so you should reduce the comsume of carbohidrates, and fats.\n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are at increased risks of obesity-related diseases. Some cardio as running and aerobics are recommended, you can start with 10 - 15 minutes of excersise of either cardio activity mentioned. You can also include some dumpbells in your training, but being careful of not force your body too much, lift only what you can support. You are over the normal weigth for your heigh, so you should reduce the comsume of carbohidrates, and fats.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are at increased risks of obesity-related diseases. It is recommendable to start with some cardio excercises such as running, sppining and some aerobics. You can also try dancing and some gimnastics with moderate intensity. In addintions, you can try lifting dumpbells with the appropiate weigh. You are over the normal weigth for your heigh, so you should reduce the comsume of carbohidrates, and fats.\n";
                            } else {
                                recomendation = "You are at increased risks of obesity-related diseases. Running for long periods of time (30 - 40 minutes), and high intensity aerobics are recommended activities. You can also try lifting some dumpbells according to what you can support, doing some gimnastics, and dancing. You are over the normal weigth for your heigh, so you should reduce the comsume of carbohidrates, and fats. \n";
                            }

                        }

                    }

                } else if (IMC > 30) {

                    if (person.tieneEnfermedades) {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are obese. According to the information provided, you have obesity, so you should reduce the comsume of carbohidrates, and fats work out in oder to loose the extra weigth; but you shluld check with your doctor to be sure.It is advisable to walk or run for short periods of time (5 minutes would be ok to start) and in a moderate rithm, do not force yourself too much. You can also do some spinning and aerobics but in a moderate way. Try to leave the bad habits as smoking and drinking in order to improve your health.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are obese. According to the information provided, you have obesity, so you should reduce the comsume of carbohidrates, and fats work out in oder to loose the extra weigth; but you shluld check with your doctor to be sure. It is advisable to start with some running or walking (7 - 12 minutes), and some cardio as aerobics are recommended too. Just be moderate with the activities you do, do jo force your body too much. Try to leave the bad habits as smoking and drinking in order to improve your health. \n";
                            } else {
                                recomendation = "You are obese. According to the information provided, you have obesity, so you should reduce the comsume of carbohidrates, and fats work out in oder to loose the extra weigth; but you shluld check with your doctor to be sure. It is advisable to run or walk for short periods of time (10-15 minute), do some spinning and aerobiocs. You can also try to include some weigh in your activities, such as dumbbells according to your physical strength. Do not force yourself too much and try to leave the bad habits as smoking and drinking in order to improve your health. \n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are obese. According to the information provided, you have obesity, so you should reduce the comsume of carbohidrates, and fats work out in oder to loose the extra weigth. It is advisable to run for short periods of time (10 minutes would be ok to start) and in a moderate rithm, do not force yourself too much. You can also do some spinning and aerobics but in a moderate way. \n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are obese. According to the information provided, you hav obesity, so you should reduce the comsume of carbohidrates, and fats work out in oder to loose the extra weigth; but you shluld check with your doctor to be sure. It is advisable to start with some running (10 - 15 minutes), and some cardio as aerobics are recommended too. Just be moderate with the activities you do, do jo force your body too much. \n";
                            } else {
                                recomendation = "You are obese. According to the information provided, you hav obesity, so you should reduce the comsume of carbohidrates, and fats work out in oder to loose the extra weigth; but you shluld check with your doctor to be sure. It is advisable to run for short periods of time (15-20 minute), do some spinning and aerobiocs. You can also try to include some weigh in your activities, such as dumbbells according to your physical strength. Do not force yourself too much, do it in a rithm you can maitain. \n";
                            }

                        }

                    } else {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are obese. According to the information provided, you hav obesity, so you should reduce the comsume of carbohidrates, and fats work out in oder to loose the extra weigth; but you shluld check with your doctor to be sure. Some cardio as running and aerobics are recommended, you can start with 7 - 10 minutes of excersise of either cardio activity mentioned. You can also include some dumpbells in your training, but being careful of not force your body too much, lift only what you can support. Try to leave the bad habits as smoking and drinking in order to improve your health. \n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are obese. According to the information provided, you hav obesity, so you should reduce the comsume of carbohidrates, and fats work out in oder to loose the extra weigth; but you shluld check with your doctor to be sure. It is recommendable to start with some cardio excercises such as running, sppining and some aerobics. You can also try dancing and some gimnastics with moderate intensity. In addintions, you can try lifting dumpbells with the appropiate weigh. Try to leave the bad habits as smoking and drinking in order to improve your health. \n";
                            } else {
                                recomendation = "You are obese. According to the information provided, you hav obesity, so you should reduce the comsume of carbohidrates, and fats work out in oder to loose the extra weigth; but you shluld check with your doctor to be sure. Running for medium time periods of time (25 - 30 minutes), and high intensity aerobics are recommended activities. You can also try lifting some dumpbells according to what you can support, doing some gimnastics, and dancing. Try to leave the bad habits as smoking and drinking in order to improve your health. \n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are obese. According to the information provided, you hav obesity, so you should reduce the comsume of carbohidrates, and fats work out in oder to loose the extra weigth; but you shluld check with your doctor to be sure. Some cardio as running and aerobics are recommended, you can start with 10 - 15 minutes of excersise of either cardio activity mentioned. You can also include some dumpbells in your training, but being careful of not force your body too much, lift only what you can support. \n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are obese. According to the information provided, you hav obesity, so you should reduce the comsume of carbohidrates, and fats work out in oder to loose the extra weigth; but you shluld check with your doctor to be sure. It is recommendable to start with some cardio excercises such as running, sppining and some aerobics. You can also try dancing and some gimnastics with moderate intensity. In addintions, you can try lifting dumpbells with the appropiate weigh.\n";
                            } else {
                                recomendation = "You are obese. Running for long periods of time (30 - 40 minutes), and high intensity aerobics are recommended activities. You can also try lifting some dumpbells according to what you can support, doing some gimnastics, and dancing. You are over the normal weigth for your heigh, so you should reduce the comsume of carbohidrates, and fats.\n";
                            }

                        }

                    }

                }

            } else {

                if (IMC < 18.5) {

                    if (person.tieneEnfermedades) {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are underweight. It is advisable to walk or run for long periods of time (10-15 minutes would be ok to start) but in a low rithm, do not force yourself too much. You can also do some spinning and aerobics but in a low intensity way and for a long time. Try to leave the bad habits as smoking and drinking in order to improve your health, and eat more protein and vegetables according to the recommendations of tour doctor.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are underweight. It is advisable to start with some running or walking (20 - 25 minutes), and some cardio as aerobics are recommended too. Do the recommended excersices in a low intensity, but for long periods of time. Try to leave the bad habits as smoking and drinking in order to improve your health, and eat more protein and vegetables according to the recommendations of tour doctor.\n";
                            } else {
                                recomendation = "You are underweight. It is advisable to run or walk for long periods of time (35-45 minutes), do some spinning and aerobiocs. You can also try to include some weigh in your activities, such as dumbbells according to your physical strength. The recommended excersise should be sone at a low intensity, but for long periods of time. Do not force yourself too much and try to leave the bad habits as smoking and drinking in order to improve your health, and eat more protein and vegetables according to the recommendations of tour doctor.\n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are underweight. It is advisable to run for long periods of time (15 minutes would be ok to start) and in a low intensity rithm, do not force yourself too much. You can also do some spinning and aerobics but in a low intensity way. You are under the normal weigh for your heigh, so it is recommendable for you to eat more protein and vegetables as well as some carbohidrates and fats.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are underweight. It is advisable to start with some running (20 - 30 minutes), and some cardio as aerobics are recommended too. Just do the the recommended activities at a low intensity and for long periods of time, do not force your body too much. You are under the normal weigh for your heigh, so it is recommendable for you to eat more protein and vegetables as well as some carbohidrates and fats.\n";
                            } else {
                                recomendation = "You are underweight. It is advisable to run for short periods of time (35-45 minutes), do some spinning and aerobiocs. You can also try to include some weigh in your activities, such as dumbbells according to your physical strength. Do not force yourself too much, do it at a low intensity and for long periods of time. You are under the normal weigh for your heigh, so it is recommendable for you to eat more protein and vegetables as well as some carbohidrates and fats.\n";
                            }

                        }

                    } else {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are underweight. Some cardio as running and aerobics are recommended, you can start with 15 - 20 minutes of excersise of either cardio activity mentioned but at a low intensity. You can also include some dumpbells in your training, but being careful of not force your body too much, lift only what you can support. Try to leave the bad habits as smoking and drinking in order to improve your health. You are under the normal weigh for your heigh, so it is recommendable for you to eat more protein and vegetables as well as some carbohidrates and fats.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are underweight. It is recommendable to start with some cardio excercises such as running, sppining and some aerobics. You can also try dancing and some gimnastics at a low intensity and for long periods of time. In addition, you can try lifting dumpbells with the appropiate weigh. Try to leave the bad habits as smoking and drinking in order to improve your health. You are under the normal weigh for your heigh, so it is recommendable for you to eat more protein and vegetables as well as some carbohidrates and fats.\n";
                            } else {
                                recomendation = "You are underweight. Running for long time periods of time (35 - 45 minutes), and low intensity aerobics are recommended activities. You can also try lifting some dumpbells according to what you can support, doing some gimnastics, and dancing. Try to leave the bad habits as smoking and drinking in order to improve your health. You are under the normal weigh for your heigh, so it is recommendable for you to eat more protein and vegetables as well as some carbohidrates and fats.\n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are underweight. Some cardio as running and aerobics are recommended, you can start with 20 - 25 minutes of excersise of either cardio activity mentioned but at a low intensity, so you can maitain the rithm for a long time. You can also include some dumpbells in your training, but being careful of not force your body too much, lift only what you can support. You are under the normal weigh for your heigh, so it is recommendable for you to eat more protein and vegetables as well as some carbohidrates and fats.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are underweight. It is recommendable to start with some cardio excercises such as running, sppining and some aerobics. You can also try dancing and some gimnastics at a low intensity and for long periods of time. In addintions, you can try lifting dumpbells with the appropiate weigh. You are under the normal weigh for your heigh, so it is recommendable for you to eat more protein and vegetables as well as some carbohidrates and fats. \n";
                            } else {
                                recomendation = "You are underweight. Running for long periods of time (40 - 50 minutes), and moderate intensity aerobics are recommended activities for you. You can also try lifting some dumpbells according to what you can support, doing some gimnastics, and dancing. You are under the normal weigh for your heigh, so it is recommendable for you to eat more protein and vegetables as well as some carbohidrates and fats.\n";
                            }

                        }

                    }

                } else if (IMC >= 18.5 && IMC <= 24.9) {

                    if (person.tieneEnfermedades) {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are already in your optimal weight range.You can walk or run for long periods of time (10 minutes would be ok to start) but in a low rithm, do not force yourself too much. You can also do some spinning and aerobics for long sessions at low intensity. Try to leave the bad habits as smoking and drinking in order to improve your health. Check with your doctor the excercises you want to do just to be sure there are not going to be bad consequences.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are already in your optimal weight range.You can start with some running or walking (15 - 20 minutes), and you can try some cardio as aerobics too. Wherever actibity you do. do it at a low intensity and for long periods of time, do jo force your body too much. Try to leave the bad habits as smoking and drinking in order to improve your health. Check with your doctor the excercises you want to do just to be sure there are not going to be bad consequences.\n";
                            } else {
                                recomendation = "You are already in your optimal weight range.You can run or walk for long periods of time (25-40 minutes), do some spinning and aerobiocs. You can also try to include some weigh in your activities, such as dumbbells according to your physical strength. Do not force yourself too much and try to leave the bad habits as smoking and drinking in order to improve your health. Check with your doctor the excercises you want to do just to be sure there are not going to be bad consequences.\n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are already in your optimal weight range.You can walk or run for long periods of time (10 minutes would be ok to start) but in a low rithm, do not force yourself too much. You can also do some spinning and aerobics for long sessions at low intensity. Check with your doctor the excercises you want to do just to be sure there are not going to be bad consequences.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are already in your optimal weight range.You can start with some running or walking (15 - 20 minutes), and you can try some cardio as aerobics too. Wherever actibity you do. do it at a low intensity and for long periods of time, do jo force your body too much. Check with your doctor the excercises you want to do just to be sure there are not going to be bad consequences.\n";
                            } else {
                                recomendation = "You are already in your optimal weight range.You can run or walk for long periods of time (25-40 minutes), do some spinning and aerobiocs. You can also try to include some weigh in your activities, such as dumbbells according to your physical strength. Do not force yourself too much. Check with your doctor the excercises you want to do just to be sure there are not going to be bad consequences.\n";
                            }

                        }

                    } else {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are already in your optimal weight range.You can walk or run for long periods of time (10 minutes would be ok to start) but in a low rithm, do not force yourself too much. You can also do some spinning and aerobics for long sessions at low intensity. Try to leave the bad habits as smoking and drinking in order to improve your health.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are already in your optimal weight range.You can start with some running or walking (15 - 20 minutes), and you can try some cardio as aerobics too. Wherever actibity you do. do it at a low intensity and for long periods of time, do jo force your body too much. Try to leave the bad habits as smoking and drinking in order to improve your health.\n";
                            } else {
                                recomendation = "You are already in your optimal weight range.You can run or walk for long periods of time (25-40 minutes), do some spinning and aerobiocs. You can also try to include some weigh in your activities, such as dumbbells according to your physical strength. Do not force yourself too much and try to leave the bad habits as smoking and drinking in order to improve your health.\n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are already in your optimal weight range.You can walk or run for long periods of time (10 minutes would be ok to start) but in a low rithm, do not force yourself too much. You can also do some spinning and aerobics for long sessions at low intensity. \n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are already in your optimal weight range.You can start with some running or walking (15 - 20 minutes), and you can try some cardio as aerobics too. Wherever actibity you do. do it at a low intensity and for long periods of time, do jo force your body too much. \n";
                            } else {
                                recomendation = "You are already in your optimal weight range.You can run or walk for long periods of time (25-40 minutes), do some spinning and aerobiocs. You can also try to include some weigh in your activities, such as dumbbells according to your physical strength. Do not force yourself too much.\n";
                            }

                        }

                    }

                } else if (IMC >= 25 && IMC <= 29.9) {

                    if (person.tieneEnfermedades) {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are \"overweight\".You can walk or run for long periods of time (10 minutes would be ok to start) but in a low rithm, do not force yourself too much. You can also do some spinning and aerobics for long sessions at low intensity. Try to leave the bad habits as smoking and drinking in order to improve your health. Check with your doctor the excercises you want to do just to be sure there are not going to be bad consequences.";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are \"overweight\".You can start with some running or walking (15 - 20 minutes), and you can try some cardio as aerobics too. Wherever actibity you do. do it at a low intensity and for long periods of time, do jo force your body too much. Try to leave the bad habits as smoking and drinking in order to improve your health. Check with your doctor the excercises you want to do just to be sure there are not going to be bad consequences.\n";
                            } else {
                                recomendation = "You are \"overweight\".You can run or walk for long periods of time (25-40 minutes), do some spinning and aerobiocs. You can also try to include some weigh in your activities, such as dumbbells according to your physical strength. Do not force yourself too much and try to leave the bad habits as smoking and drinking in order to improve your health. Check with your doctor the excercises you want to do just to be sure there are not going to be bad consequences.\n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are \"overweight\".You can walk or run for long periods of time (10 minutes would be ok to start) but in a low rithm, do not force yourself too much. You can also do some spinning and aerobics for long sessions at low intensity. Check with your doctor the excercises you want to do just to be sure there are not going to be bad consequences.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are \"overweight\".You can start with some running or walking (15 - 20 minutes), and you can try some cardio as aerobics too. Wherever actibity you do. do it at a low intensity and for long periods of time, do jo force your body too much. Check with your doctor the excercises you want to do just to be sure there are not going to be bad consequences.\n";
                            } else {
                                recomendation = "You are \"overweight\".You can run or walk for long periods of time (25-40 minutes), do some spinning and aerobiocs. You can also try to include some weigh in your activities, such as dumbbells according to your physical strength. Do not force yourself too much. Check with your doctor the excercises you want to do just to be sure there are not going to be bad consequences.\n";
                            }

                        }

                    } else {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are \"overweight\".You can walk or run for long periods of time (10 minutes would be ok to start) but in a low rithm, do not force yourself too much. You can also do some spinning and aerobics for long sessions at low intensity. Try to leave the bad habits as smoking and drinking in order to improve your health.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are \"overweight\".You can start with some running or walking (15 - 20 minutes), and you can try some cardio as aerobics too. Wherever actibity you do. do it at a low intensity and for long periods of time, do jo force your body too much. Try to leave the bad habits as smoking and drinking in order to improve your health.\n";
                            } else {
                                recomendation = "You are \"overweight\".You can run or walk for long periods of time (25-40 minutes), do some spinning and aerobiocs. You can also try to include some weigh in your activities, such as dumbbells according to your physical strength. Do not force yourself too much and try to leave the bad habits as smoking and drinking in order to improve your health.\n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are \"overweight\".You can walk or run for long periods of time (10 minutes would be ok to start) but in a low rithm, do not force yourself too much. You can also do some spinning and aerobics for long sessions at low intensity. \n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are \"overweight\".You can start with some running or walking (15 - 20 minutes), and you can try some cardio as aerobics too. Wherever actibity you do. do it at a low intensity and for long periods of time, do jo force your body too much. \n";
                            } else {
                                recomendation = "You are \"overweight\".You can run or walk for long periods of time (25-40 minutes), do some spinning and aerobiocs. You can also try to include some weigh in your activities, such as dumbbells according to your physical strength. Do not force yourself too much.\n";
                            }

                        }

                    }

                } else if (IMC > 30) {

                    if (person.tieneEnfermedades) {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are over the weight recommended for your heigth, so it is advisable that you reduce the caloric intake, check with your doctor for an appropiate food plan. You can walk or run for long periods of time (10 minutes would be ok to start) but in a low rithm, do not force yourself too much. You can also do some spinning and aerobics for long sessions at low intensity. Try to leave the bad habits as smoking and drinking in order to improve your health. Check with your doctor the excercises you want to do just to be sure there are not going to be bad consequences.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are over the weight recommended for your heigth, so it is advisable that you reduce the caloric intake, check with your doctor for an appropiate food plan. You can start with some running or walking (15 - 20 minutes), and you can try some cardio as aerobics too. Wherever actibity you do. do it at a low intensity and for long periods of time, do jo force your body too much. Try to leave the bad habits as smoking and drinking in order to improve your health. Check with your doctor the excercises you want to do just to be sure there are not going to be bad consequences.\n";
                            } else {
                                recomendation = "You are over the weight recommended for your heigth, so it is advisable that you reduce the caloric intake, check with your doctor for an appropiate food plan. You can run or walk for long periods of time (25-40 minutes), do some spinning and aerobiocs. You can also try to include some weigh in your activities, such as dumbbells according to your physical strength. Do not force yourself too much and try to leave the bad habits as smoking and drinking in order to improve your health. Check with your doctor the excercises you want to do just to be sure there are not going to be bad consequences.\n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are over the weight recommended for your heigth, so it is advisable that you reduce the caloric intake, check with your doctor for an appropiate food plan. You can walk or run for long periods of time (10 minutes would be ok to start) but in a low rithm, do not force yourself too much. You can also do some spinning and aerobics for long sessions at low intensity. Check with your doctor the excercises you want to do just to be sure there are not going to be bad consequences.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are over the weight recommended for your heigth, so it is advisable that you reduce the caloric intake, check with your doctor for an appropiate food plan. You can start with some running or walking (15 - 20 minutes), and you can try some cardio as aerobics too. Wherever actibity you do. do it at a low intensity and for long periods of time, do jo force your body too much. Check with your doctor the excercises you want to do just to be sure there are not going to be bad consequences.\n";
                            } else {
                                recomendation = "You are over the weight recommended for your heigth, so it is advisable that you reduce the caloric intake, check with your doctor for an appropiate food plan. You can run or walk for long periods of time (25-40 minutes), do some spinning and aerobiocs. You can also try to include some weigh in your activities, such as dumbbells according to your physical strength. Do not force yourself too much. Check with your doctor the excercises you want to do just to be sure there are not going to be bad consequences.\n";
                            }

                        }

                    } else {

                        if (person.drink || person.smoke) {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are over the weight recommended for your heigth, so it is advisable that you reduce the caloric intake, check with your doctor for an appropiate food plan. You can walk or run for long periods of time (10 minutes would be ok to start) but in a low rithm, do not force yourself too much. You can also do some spinning and aerobics for long sessions at low intensity. Try to leave the bad habits as smoking and drinking in order to improve your health.\n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are over the weight recommended for your heigth, so it is advisable that you reduce the caloric intake, check with your doctor for an appropiate food plan. You can start with some running or walking (15 - 20 minutes), and you can try some cardio as aerobics too. Wherever actibity you do. do it at a low intensity and for long periods of time, do jo force your body too much. Try to leave the bad habits as smoking and drinking in order to improve your health.\n";
                            } else {
                                recomendation = "You are over the weight recommended for your heigth, so it is advisable that you reduce the caloric intake, check with your doctor for an appropiate food plan. You can run or walk for long periods of time (25-40 minutes), do some spinning and aerobiocs. You can also try to include some weigh in your activities, such as dumbbells according to your physical strength. Do not force yourself too much and try to leave the bad habits as smoking and drinking in order to improve your health.\n";
                            }

                        } else {

                            if (person.activity.equals("SEDENTARY")) {
                                recomendation = "You are over the weight recommended for your heigth, so it is advisable that you reduce the caloric intake, check with your doctor for an appropiate food plan. You can walk or run for long periods of time (10 minutes would be ok to start) but in a low rithm, do not force yourself too much. You can also do some spinning and aerobics for long sessions at low intensity. \n";
                            } else if (person.activity.equals("MODERATE")) {
                                recomendation = "You are over the weight recommended for your heigth, so it is advisable that you reduce the caloric intake, check with your doctor for an appropiate food plan. You can start with some running or walking (15 - 20 minutes), and you can try some cardio as aerobics too. Wherever actibity you do. do it at a low intensity and for long periods of time, do jo force your body too much. \n";
                            } else {
                                recomendation = "You are over the weight recommended for your heigth, so it is advisable that you reduce the caloric intake, check with your doctor for an appropiate food plan. You can run or walk for long periods of time (25-40 minutes), do some spinning and aerobiocs. You can also try to include some weigh in your activities, such as dumbbells according to your physical strength. Do not force yourself too much.\n";
                            }

                        }

                    }

                }

            }

        }

        return recomendation;

    }

}
