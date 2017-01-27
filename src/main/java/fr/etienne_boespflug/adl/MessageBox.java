/* MessageBox.java
 * 2017 Etienne Boespflug - This file is distributed under the Creative Commons Attribution-ShareAlike 4.0 International License.
 */

package fr.etienne_boespflug.adl;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * The MessageBox class provides static method for generating standard
 * AlertDialog.
 * <p>
 * The information, warning, critical and question dialogs are availables.
 * <p></p>
 *
 * @author  Etienne Boespflug
 * @version 1.0
 * Created by Etienne Boespflug on 1/7/2017.
 */

@SuppressWarnings({"WeakerAccess", "unused"})
public class MessageBox {
    /* Utility class */
    private MessageBox() {}

    /**
     * Creates a new information AlertDialog with the specified message and title.
     * <p>
     * A positive button is added to the dialog if the string {@code positiveButtonText}
     * is not null. If {@code onPositiveClickListener} is not null, use this listener for
     * the positive button, otherwise use a default listener which do nothing.
     * <p>
     *
     * @param context                   the parent context.
     * @param title                     the title of the dialog.
     * @param message                   the information message of the dialog.
     * @param positiveButtonText        the text of the positive button if the string is non-null.
     *                                  Otherwise, no button is created.
     * @param onPositiveClickListener   the listener of the positive button (if the dialog has a
     *                                  positive button) if non-null, use a default listener otherwise.
     * @return the created information alert dialog.
     *
     * @see #information(Context, String, String, String)
     * @see #information(Context, String, String)
     */
    static public AlertDialog information(Context context, String title, String message, String positiveButtonText, DialogInterface.OnClickListener onPositiveClickListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        builder.setTitle(title);
        builder.setMessage(message);
        builder.setIcon(R.mipmap.private_adl_icon_information);
        if(positiveButtonText != null) {
            if(onPositiveClickListener == null)
                builder.setPositiveButton(positiveButtonText, defaultOnClickListener());
            else
                builder.setPositiveButton(positiveButtonText, onPositiveClickListener);
        }

        return builder.create();
    }

    /**
     * Creates a new information AlertDialog with the specified message and title.
     * <p>
     * A positive button is added to the dialog if the string {@code positiveButtonText}
     * is not null.
     * <p>
     * Overload {@link #information(Context, String, String, String, DialogInterface.OnClickListener)}.
     * Uses a default listener which do nothing.
     *
     * @param context                   the parent context.
     * @param title                     the title of the dialog.
     * @param message                   the information message of the dialog.
     * @param positiveButtonText        the text of the positive button if the string is non-null.
     *                                  Otherwise, no button is created.
     * @return the created information alert dialog.
     *
     * @see #information(Context, String, String, String, DialogInterface.OnClickListener)
     * @see #information(Context, String, String)
     */
    static public AlertDialog information(Context context, String title, String message, String positiveButtonText) {
        return information(context, title, message, positiveButtonText, null);
    }

    /**
     * Creates a new information AlertDialog with the specified message and title
     * without button.
     * <p>
     * Overload {@link #information(Context, String, String, String, DialogInterface.OnClickListener)}.
     * <p>
     * Uses a default listener which do nothing.
     *
     * @param context                   the parent context.
     * @param title                     the title of the dialog.
     * @param message                   the information message of the dialog.
     * @return the created information alert dialog.
     *
     * @see #information(Context, String, String, String, DialogInterface.OnClickListener)
     * @see #information(Context, String, String, String)
     */
    static public AlertDialog information(Context context, String title, String message) {
        return information(context, title, message, null, null);
    }

    /**
     * Creates a new warning AlertDialog with the specified message and title.
     * <p>
     * A positive button is added to the dialog if the string {@code positiveButtonText}
     * is not null. If {@code onPositiveClickListener} is not null, use this listener for
     * the positive button, otherwise use a default listener which do nothing.
     * <p>
     *
     * @param context                   the parent context.
     * @param title                     the title of the dialog.
     * @param message                   the information message of the dialog.
     * @param positiveButtonText        the text of the positive button if the string is non-null.
     *                                  Otherwise, no button is created.
     * @param onPositiveClickListener   the listener of the positive button (if the dialog has a
     *                                  positive button) if non-null, use a default listener otherwise.
     * @return the created information alert dialog.
     *
     * @see #warning(Context, String, String, String)
     * @see #warning(Context, String, String)
     */
    static public AlertDialog warning(Context context, String title, String message, String positiveButtonText, DialogInterface.OnClickListener onPositiveClickListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        builder.setTitle(title);
        builder.setMessage(message);
        builder.setIcon(R.mipmap.private_adl_icon_warning);
        if(positiveButtonText != null) {
            if(onPositiveClickListener == null)
                builder.setPositiveButton(positiveButtonText, defaultOnClickListener());
            else
                builder.setPositiveButton(positiveButtonText, onPositiveClickListener);
        }

        return builder.create();
    }

    /**
     * Creates a new warning AlertDialog with the specified message and title.
     * <p>
     * A positive button is added to the dialog if the string {@code positiveButtonText}
     * is not null.
     * <p>
     * Overload {@link #information(Context, String, String, String, DialogInterface.OnClickListener)}.
     * Uses a default listener which do nothing.
     *
     * @param context                   the parent context.
     * @param title                     the title of the dialog.
     * @param message                   the information message of the dialog.
     * @param positiveButtonText        the text of the positive button if the string is non-null.
     *                                  Otherwise, no button is created.
     * @return the created information alert dialog.
     *
     * @see #warning(Context, String, String, String, DialogInterface.OnClickListener)
     * @see #warning(Context, String, String)
     */
    static public AlertDialog warning(Context context, String title, String message, String positiveButtonText) {
        return warning(context, title, message, positiveButtonText, null);
    }

    /**
     * Creates a new warning AlertDialog with the specified message and title
     * without button.
     * <p>
     * Overload {@link #information(Context, String, String, String, DialogInterface.OnClickListener)}.
     * <p>
     * Uses a default listener which do nothing.
     *
     * @param context                   the parent context.
     * @param title                     the title of the dialog.
     * @param message                   the information message of the dialog.
     * @return the created information alert dialog.
     *
     * @see #warning(Context, String, String, String)
     * @see #warning(Context, String, String)
     */
    static public AlertDialog warning(Context context, String title, String message) {
        return warning(context, title, message, null, null);
    }

    /**
     * Creates a new critical error AlertDialog with the specified message and title.
     * <p>
     * A positive button is added to the dialog if the string {@code positiveButtonText}
     * is not null. If {@code onPositiveClickListener} is not null, use this listener for
     * the positive button, otherwise use a default listener which do nothing.
     * <p>
     *
     * @param context                   the parent context.
     * @param title                     the title of the dialog.
     * @param message                   the information message of the dialog.
     * @param positiveButtonText        the text of the positive button if the string is non-null.
     *                                  Otherwise, no button is created.
     * @param onPositiveClickListener   the listener of the positive button (if the dialog has a
     *                                  positive button) if non-null, use a default listener otherwise.
     * @return the created information alert dialog.
     *
     * @see #critical(Context, String, String, String)
     * @see #critical(Context, String, String)
     */
    static public AlertDialog critical(Context context, String title, String message, String positiveButtonText, DialogInterface.OnClickListener onPositiveClickListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        builder.setTitle(title);
        builder.setMessage(message);
        builder.setIcon(R.mipmap.private_adl_icon_critical);
        if(positiveButtonText != null) {
            if(onPositiveClickListener == null)
                builder.setPositiveButton(positiveButtonText, defaultOnClickListener());
            else
                builder.setPositiveButton(positiveButtonText, onPositiveClickListener);
        }

        return builder.create();
    }

    /**
     * Creates a new critical error AlertDialog with the specified message and title.
     * <p>
     * A positive button is added to the dialog if the string {@code positiveButtonText}
     * is not null.
     * <p>
     * Overload {@link #information(Context, String, String, String, DialogInterface.OnClickListener)}.
     * Uses a default listener which do nothing.
     *
     * @param context                   the parent context.
     * @param title                     the title of the dialog.
     * @param message                   the information message of the dialog.
     * @param positiveButtonText        the text of the positive button if the string is non-null.
     *                                  Otherwise, no button is created.
     * @return the created information alert dialog.
     *
     * @see #critical(Context, String, String, String, DialogInterface.OnClickListener)
     * @see #critical(Context, String, String)
     */
    static public AlertDialog critical(Context context, String title, String message, String positiveButtonText) {
        return warning(context, title, message, positiveButtonText, null);
    }

    /**
     * Creates a new critical error AlertDialog with the specified message and title
     * without button.
     * <p>
     * Overload {@link #information(Context, String, String, String, DialogInterface.OnClickListener)}.
     * <p>
     * Uses a default listener which do nothing.
     *
     * @param context                   the parent context.
     * @param title                     the title of the dialog.
     * @param message                   the information message of the dialog.
     * @return the created information alert dialog.
     *
     * @see #critical(Context, String, String, String)
     * @see #critical(Context, String, String)
     */
    static public AlertDialog critical(Context context, String title, String message) {
        return warning(context, title, message, null, null);
    }

    /**
     * The ResponseListener interface defines the listener methods used
     * to handle the result of a response AlertDialog.
     *
     * @since 1.0
     *
     * @see #question(Context, String, String, String, String, ResponseListener)
     * @see #question(Context, String, String, ResponseListener)
     */
    public interface ResponseListener {
        /**
         * Called when the positive button (yes) is pressed.
         *
         * @param dialogInterface   The dialog that received the click.
         * @param i                 The button that was clicked or the position of the item clicked.
         */
        void onYesClicked(DialogInterface dialogInterface, int i);

        /**
         * Called when the negative button (no) is pressed.
         *
         * @param dialogInterface   The dialog that received the click.
         * @param i                 The button that was clicked or the position of the item clicked.
         */
        void onNoClicked(DialogInterface dialogInterface, int i);
    }

    /**
     * Creates a new modal question dialog with the specified message and title.
     * <p>
     * If the specified text for the positive and the negative button are {@code null}
     * the default text is used ("yes" and "no" for the default locale). Please note
     * that certain languages are not available. To handle other language, use the {@code yesText}
     * and {@code noeText} parameters to use your custom locales.
     *
     * @param context                   the parent context.
     * @param title                     the title of the dialog.
     * @param message                   the information message of the dialog.
     * @param yesText                   the text used for the positive button (yes).
     * @param noText                    the text used for the negative button (no).
     * @param responseListener          the listener handling the question response.
     * @return the created question alert dialog.
     *
     * @see #question(Context, String, String, ResponseListener)
     */
    static public AlertDialog question(Context context, String title, String message, String yesText, String noText,
                                       final ResponseListener responseListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        builder.setTitle(title);
        builder.setMessage(message);
        builder.setIcon(R.mipmap.private_adl_icon_question);

        builder.setPositiveButton((yesText != null) ? yesText : context.getString(R.string.private_adl_yes_button_text), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                responseListener.onYesClicked(dialogInterface, i);
            }
        });
        builder.setNegativeButton((noText != null) ? noText : context.getString(R.string.private_adl_no_button_text), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                responseListener.onNoClicked(dialogInterface, i);
            }
        });
        builder.setCancelable(false);

        return builder.create();
    }

    /**
     * Creates a new modal question dialog with the specified message and title.
     * <p>
     * The positive and the negative buttons use the library localization. Please note that
     * certain languages are not available. To handle other language, consider using
     * {@link #question(Context, String, String, String, String, ResponseListener)}.
     *
     * @param context                   the parent context.
     * @param title                     the title of the dialog.
     * @param message                   the information message of the dialog.
     * @param responseListener          the listener handling the question response.
     * @return the created question alert dialog.
     *
     * @see #question(Context, String, String, String, String, ResponseListener)
     */
    static public AlertDialog question(Context context, String title, String message, final ResponseListener responseListener) {
        return question(context, title, message, null, null, responseListener);
    }

    /**
     * @return the a default listener which do nothing.
     */
    private static DialogInterface.OnClickListener defaultOnClickListener() {
        return new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // Do nothing.
            }
        };
    }
}
